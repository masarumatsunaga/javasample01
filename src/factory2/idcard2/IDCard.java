package factory2.idcard2;

import factory2.framework2.Product;

public class IDCard extends Product {

	private String owner;
	private int serial;

	// パッケージプライベート
	IDCard(String owner, int serial) {
		System.out.println(owner + "のカードを" + serial + "番で作ります。");
		this.owner = owner;
		this.serial = serial;
	}

	@Override
	public void use() {
		System.out.println(this + "を使います。");
	}

	@Override
	public String toString() {
		return "[IDCard : " + owner + "(" + serial + ")" + "]";
	}

	public String getOwner() {
		return owner;
	}

	public int getSerial() {
		return serial;
	}

}
