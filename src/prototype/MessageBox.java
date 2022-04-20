package prototype;

import prototype.framework.Product;

public class MessageBox implements Product {
	// 与えられた文字列を飾り枠のように囲む文字
	private char decochar;

	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	@Override
	public void use(String s) {
		int decolen = 1 + s.length() + 1;
		for (int i = 0; i < decolen; i++) {
			System.out.print(decochar);
		}
		System.out.println();

		System.out.println(decochar + s + decochar);
		for (int i = 0; i < decolen; i++) {
			System.out.print(decochar);
		}
		System.out.println();
	}

	@Override
	public Product createCopy() {
		Product p = null;
		try {
			p = (Product) clone();
		} catch (CloneNotSupportedException e ) {
			e.printStackTrace();
		}
		return p;
	}

}
