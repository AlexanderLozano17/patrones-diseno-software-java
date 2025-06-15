package com.patron.estructural.facade;

public class Main {

	public static void main(String[] args) {
		
		MultimediaFacade multimediaSystem = new MultimediaFacade();

        // El cliente solo llama a un método simple en la fachada
        // No necesita saber sobre VideoPlayer, AudioMixer, SubtitleRenderer, etc.
        multimediaSystem.playMovie("El Gran Truco", 8, "sub_gran_truco.srt");

        // Otra operación simplificada
        multimediaSystem.playAudioOnly("musica_relax.mp3", 6); // Si existiera ese método en la fachada


	}

}
