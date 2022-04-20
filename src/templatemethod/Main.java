package templatemethod;

public class Main {
	public static void main(String[] args) {
		// 'H'を持ったCharDisplayのインスタンスを１個作る
		AbstractDisplay d1 = new CharDisplay('H');

		// "Hello, world"を持ったStringDisplayのインスタンスを１個作る
		AbstractDisplay d2 = new StringDisplay("Hello, World.");

		// d1,d2とも、全ておなじAbstractDisplayのサブクラスのインスタンスだから
		// 継承したdisplayメソッドを呼び出すことができる
		// 実際の動作は個々のクラスCharDisplayやStringDisplayで決まる
		d1.display();
		d2.display();
	}
}
