package factory2.idcard2;

import factory2.framework2.Factory;
import factory2.framework2.Product;

public class IDCardFactory extends Factory {

	private int serial = 1;

	protected synchronized Product createProduct(String owner) {
		return new IDCard(owner, serial++);
	}

	@Override
	protected void registerProduct(Product product) {
		System.out.println(product + "を登録しました。");
	}

}
