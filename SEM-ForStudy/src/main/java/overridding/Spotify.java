package overridding;

public class Spotify extends Music {

	public void playing() {

		System.out.println("playing music in spotify");

	}

	public static void main (String[] args) {

		Spotify spotify = new Spotify();
		spotify.playing();
		
		Music music = new Music();
		music.playing();
	}
}