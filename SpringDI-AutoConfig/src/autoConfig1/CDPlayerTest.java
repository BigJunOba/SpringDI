package autoConfig1;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// 声明测试套件运行器，为了让测试在Spring容器环境下执行,以便在测试开始的时候自动创建Spring的上下文。
@RunWith(SpringJUnit4ClassRunner.class)   
// 1.告诉Spring要在CDPlayerConfig中加载配置，因为CDPlayerConfig类中包含了@ComponentScan，启动了Spring的组件扫描。
// 2.由于Spring启动了组件扫描，因此可以扫描出所有带有@Component注解的类，即SgtPeppers类和@Component类，并且在Spring中为其创建一个bean。
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
	
	@Rule // 这个注解是为了在执行case的时候加入测试者特有的操作，而不影响原有的case代码：减小了特有操作和case原逻辑的耦合。
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	// 将MediaPlayer bean注入到测试代码之中。
	@Autowired
	private MediaPlayer player;

	// 将CompactDisc bean注入到测试代码之中。
	@Autowired
	private CompactDisc cd;

	// 简单的测试断言cd属性不为null。
	// 如果它不为null，就意味着Spring能够发现CompactDisc类，自动在Spring上下文中将其创建为bean并将其注入到测试代码之中。
	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}
	
	// 简单的测试断言player属性不为null。
	// 如果它不为null，就意味着Spring能够发现CompactDisc类，自动在Spring上下文中将其创建为bean并将其注入到测试代码之中。
	@Test
	public void playerShouldNotBeNull() {
		assertNotNull(player);
	}

	// systemOutRule规则可以基于控制台的输出编写断言，这里断言play()方法的输出被发送到了控制台。
	@Test
	public void play() {
		player.play();
		assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\r\n", systemOutRule.getLog());
	}

}
