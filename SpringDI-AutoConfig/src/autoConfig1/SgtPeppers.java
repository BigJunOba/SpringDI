package autoConfig1;
import org.springframework.stereotype.Component;
/**
 * 《Sgt. Pepper's Lonely Hearts Club Band》 是英国摇滚乐队The Beatles发行的第8张录音室专辑。
 * 在SgtPeppers类上使用了@Component注解。
 * 组件扫描默认是不启用的，还需要命令Spring去寻找带有@Component注解的类，并为其创建bean。
 */
@Component // 这个注解表明该类会作为组件类，并告知Spring要为这个类创建bean。
public class SgtPeppers implements CompactDisc {

	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
