package com.patron.estructural.facade;

public class AudioMixer {
	
    void adjustVolume(int level) {
        System.out.println("AudioMixer: Ajustando volumen a " + level);
    }
    
    void playAudio() {
    	System.out.println("AudioMixer: Iniciando con volumen UP");
    }
}
