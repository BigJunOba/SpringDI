package xmlConfigTest4;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class CNamespaceValueTest {

	@Rule
	public final SystemOutRule log = new SystemOutRule().enableLog();

	@Autowired
	private MediaPlayer player;

	@Test
	public void play() {
		player.play();
		assertEquals("Playing You Don't Love Me， LaDao by Jay Chou\r\n", log.getLog());
	}

}
