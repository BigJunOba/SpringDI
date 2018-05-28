package javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * 创建JavaConfig类的关键在于为其添加@Configuration注解
 * 在没有@ComponentScan注解的情况下，即不开启组件扫描时，会出现BeanCreationException异常。
 * 要在JavaConfig中声明bean，需要编写一个方法，这个方法会创建所需类型的实例，然后给这个方法添加@Bean注解。
 * 构造器和Setter方法知识@Bean方法的两个简单的例子，可以采用任何必要的Java功能来产生bean实例。
 */
@Configuration // 这个注解表明这个类是一个配置类，该类包含在Spring应用上下文中如何创建bean的细节。
public class CDPlayerConfig {
	
	//第一种情况是：CompactDisc bean是非常简单的，它自身没有其他的依赖。
	//@Bean注解会告诉Spring的是compactDisc方法将会返回一个SgtPeppers对象，该对象要注册为Spring应用上下文中的bean。
	@Bean
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}

	// 第二种情况是：CDPlayer bean依赖于CompactDisc bean
	// @Bean注解会告诉Spring的是cdPlayer方法将会返回一个CDPlayer对象，该对象要注册为Spring应用上下文中的bean。
	// 1.当Spring调用cdPlayer方法创建CDPlayer bean的时候，它会自动装配一个CompactDisc bean到配置方法中。
	// 2.然后，方法体就可以按照合适的方式来使用它。
	// 3.cdPlayer方法也能够将CompactDisc注入到CDPlayer的构造器中，而且不用明确引用CompactDisc的@Bean方法。
	// 4.不管CompactDisc bean是通过什么方式创建出来的，Spring都会将其传入到配置方法中，并用来创建CDPlayer bean。
	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc) {
		return new CDPlayer(compactDisc);
	}

}
