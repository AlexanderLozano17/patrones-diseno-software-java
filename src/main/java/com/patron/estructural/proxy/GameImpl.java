package com.patron.estructural.proxy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class GameImpl implements Game {
	
	private Stats stats;
	
	public Stats getStats() {
		return stats;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
	}

	@Override
	public void save(String name) {
		try {
			writeObject(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Stats load(String name) {
		// TODO Auto-generated method stub
		Stats stats = null;
		try {
			stats = (Stats) readObject(name);
			setStats(stats);
			return stats;
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void newGame(String name) throws IOException {
		File file = new File(name);
		Stats stats = new Stats(name, 1, 0, 0);
		stats.setCreateAt(new Date());
		stats.setLastSave(new Date());
		setStats(stats);
		
		file.createNewFile();
		writeObject(name);
	}
	
	private void writeObject(String name) throws IOException {
		FileOutputStream fos = new FileOutputStream(name);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(getStats());
		oos.flush();
		oos.close();
		fos.flush();
		fos.close();
	}
	
	private Object readObject(String name) throws IOException, ClassNotFoundException {
		FileInputStream	fis = new FileInputStream(name);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object stats = ois.readObject();
		ois.close();
		fis.close();
		return stats;
	}

}
