package overloading;

public class Music {

	public void playing() {
		System.out.println("playing music");
	}

	public void playing(String songName) {
		System.out.println("playing music "+songName);
	}

	public void playing(String songName, int volume) {
		System.out.println("playing music "+songName+" "+volume);
	}

	public static void main(String[] args) {

		Music music = new Music();

		music.playing();
		music.playing("xyz song");
		music.playing("abc song", 13);
	}
}