package builder2;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {

		FrameBuilder framebuilder = new FrameBuilder();
		Director director = new Director(framebuilder);
		director.construct();
		JFrame frame = framebuilder.getFrameResult();
		frame.setVisible(true);


//		if (args.length != 1) {
//			usage();
//			System.exit(0);
//		}

//		if (args[0].equals("text")) {
//			TextBuilder textBuilder = new TextBuilder();
//			Director director = new Director(textBuilder);
//			director.construct();
//			String result = textBuilder.getTextResult();
//			System.out.println(result);
//
//		} else if (args[0].equals("html")) {
//			HTMLBuilder htmlBuilder = new HTMLBuilder();
//			Director director = new Director(htmlBuilder);
//			director.construct();
//			String filename = htmlBuilder.getHTMLResult();
//			System.out.println("HTMLファイル" + filename + "が作成されました。");
//
//		} else {
//			usage();
//			System.exit(0);
//		}
	}

	// 使い方を表示する
	public static void usage() {
		System.out.println("Usage: java Main text     テキストで文書作成");// テキストで文書作成
		System.out.println("Usage: java Main html     HTMLファイルで文章作成");// HTMLファイルで文章作成
	}
}
