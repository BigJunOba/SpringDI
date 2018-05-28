package autoConfig1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 声明CDPlayer类作为组件类，并且添加注解实现自动装配。
 * 自动装配就是让Spring自动满足bean依赖的一种方法。
 * 在满足依赖的过程中，会在Spring应用上下文中寻找匹配某个bean需求的其他bean。
 * 如果没有匹配的bean，那么在应用上下文创建的时候，Spring会抛出一个异常。
 * 为了避免异常的出现，可以使用@Autowired(required=false)，让没有匹配的bean处于为匹配状态。
 * 但是，这种情况如果没有进行null检查的话，这个处于为装配状态的属性有可能会出现空指针异常。
 */
@Component // 这个注解表明该类会作为组件类，并告知Spring要为这个类创建bean。
public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;
	// 1.在CDPlayer类的构造器上添加@Autowired注解。
	// 2.这表明当Spring创建CDPlayer bean的时候，会通过这个构造器来进行实例化，
	// 3.并且会传入一个可设置给CompactDisc类型的bean。
	@Autowired 
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		cd.play();
	}

}
