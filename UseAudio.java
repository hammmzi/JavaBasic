
public class UseAudio {

	public static void main(String[] args) {
		
		Stereo s = new Stereo();
		System.out.println("------Stereoを使う-------");
		s.play();
		s.stop();
		
		MP3Player m = new MP3Player();
		System.out.println("------MP3を使う-------");
		m.play();
		m.stop();
	}

}
