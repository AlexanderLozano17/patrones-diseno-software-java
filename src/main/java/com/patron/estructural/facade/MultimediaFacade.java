package com.patron.estructural.facade;

public class MultimediaFacade {

    private VideoPlayer videoPlayer;
    private AudioMixer audioMixer;
    private SubtitleRenderer subtitleRenderer;
    
    // El constructor de la fachada inicializa los subsistemas.
    // (Podría usar Inyección de Dependencias aquí, como vimos antes,
    // pero para un ejemplo sencillo, la creación directa es clara).
    public MultimediaFacade() {
        this.videoPlayer = new VideoPlayer();
        this.audioMixer = new AudioMixer();
        this.subtitleRenderer = new SubtitleRenderer();
    }
    
    // Método simplificado de alto nivel para el cliente
    public void playMovie(String movieTitle, int volume, String subtitleFile) {
        System.out.println("\n--- Iniciando reproducción de película ---");
        videoPlayer.playVideo(movieTitle);
        audioMixer.adjustVolume(volume);
        subtitleRenderer.showSubtitles(subtitleFile);
        System.out.println("--- Película lista para disfrutar ---");
    }

    // Otro método simplificado, por ejemplo, solo para audio
    public void playAudioOnly(String audioFile, int volume) {
        System.out.println("\n--- Iniciando reproducción de audio ---");
        audioMixer.playAudio(); // Asumimos un AudioPlayer si solo es audio
        audioMixer.adjustVolume(volume);
        System.out.println("--- Audio listo ---");
    }
}
