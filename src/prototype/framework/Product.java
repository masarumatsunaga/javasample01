package prototype.framework;

public interface Product extends Cloneable{
	// 使うためのもの
	public abstract void use(String s);
	// インスタンスの複製を行うためのもの
	public abstract Product createCopy();

}
