package xmlConfigTest5;

import java.util.List;
public class ListDisc implements CompactDisc {

	private String title;
	private String artist;
	private List<String> tracks;

	public ListDisc(String title, String artist, List<String> tracks) {
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
		for (String track : tracks) {
			System.out.println("-Track: " + track);
		}
	}

}
