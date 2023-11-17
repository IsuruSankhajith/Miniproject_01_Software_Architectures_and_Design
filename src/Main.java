public class Main {
    public static void main(String[] args) {
        // Create an instance of the AudioPlayer class
        AudioPlayer audioPlayer = new AudioPlayer();

        // Test playing mp3
        audioPlayer.play("mp3", "beyond the horizon.mp3");

        // Test playing mp4
        audioPlayer.play("mp4", "alone.mp4");

        // Test playing vlc
        audioPlayer.play("vlc", "far far away.vlc");

        // Test playing unsupported avi format
        audioPlayer.play("avi", "video.avi");
    }
}
