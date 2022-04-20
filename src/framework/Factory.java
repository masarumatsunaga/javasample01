package framework;

public abstract class Factory {

	// Template Method
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	// 抽象メソッド
	protected abstract Product createProduct(String owner);// 製品を作る
	protected abstract void registerProduct(Product product);// 登録する
}
