package factory2;

import factory2.framework2.Factory;
import factory2.framework2.Product;
import factory2.idcard2.IDCardFactory;

public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("Hiroshi Yuki");
		Product card2 = factory.create("Tomura");
		Product card3 = factory.create("Hanako Sato");
		card1.use();
		card2.use();
		card3.use();
	}
}
