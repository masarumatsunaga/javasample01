package templatemethod;

public abstract class AbstractDisplay {
	// open,print,closeメソッドはサブクラスに実装を任せる
	public abstract void open();
	public abstract void print();
	public abstract void close();

	// displayメソッドはAbstractDisplayで実装しているメソッド
	public final void display() {
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}
