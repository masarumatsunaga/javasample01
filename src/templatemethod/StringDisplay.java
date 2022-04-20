package templatemethod;

public class StringDisplay extends AbstractDisplay{
	private String string;
	private int width;

	public StringDisplay(String string) {
		super();
		this.string = string;
		this.width = string.length();
	}

	@Override
	public void open() {
		printLine();
	}

	@Override
	public void print() {
		System.out.println("|" + this.string + "|");
	}

	@Override
	public void close() {
		printLine();
	}

	// open,closeから呼び出されるメソッド
	private void printLine() {
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}


}
