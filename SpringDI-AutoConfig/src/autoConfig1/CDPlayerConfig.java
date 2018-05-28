package autoConfig1;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * @Configuration用于定义配置类，可替换XML文件。
 * @ComponentScan注解能够在Spring中启用组件扫描：
 * 1.如果没有其他配置的话，@ComponentScan默认会扫描与配置类相同的包。
 * 2.因此Spring将会扫描autoConfig1包以及这个包下的所有子包，寻找带有@Component注解的类。
 * 3.由于SgtPeppers类带有@Component注解，所以被发现了，并且会在Spring中自动为其创建一个bean。
 */
@Configuration
@ComponentScan
// 类CDPlayerConfig通过Java代码定义了Spring的装配规则，并没有显式地声明任何bean。
public class CDPlayerConfig {
	
	}
