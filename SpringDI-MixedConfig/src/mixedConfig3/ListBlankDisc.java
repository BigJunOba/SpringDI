package mixedConfig3;

import java.util.List;

public class ListBlankDisc implements CompactDisc {

	private String title;
	private String artist;
	private List<String> tracks;

	public ListBlankDisc(String title, String artist, List<String> tracks) {
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