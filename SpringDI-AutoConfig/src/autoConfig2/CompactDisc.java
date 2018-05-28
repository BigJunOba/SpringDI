package autoConfig2;
/**
 * 如果你不将CD插入(注入)到CD播放器中，那么CD播放器其实没有太大用处的。
 * 所以可以这样说，CD播放器依赖于CD才能完成它的使命。
 * CompactDisc接口定义了CD播放器对一盘CD所能进行的操作。
 * 它将CD播放器的任意实现与CD本身的耦合降低到了最小的程度。
 */
public interface CompactDisc {
	
	void play();
}
