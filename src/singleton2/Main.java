package singleton2;

public class Main {
	public static void main(String[] args) {

		System.out.println("Start.");
		Triple a1 = Triple.getInstance("ALPHA");
		Triple b1 = Triple.getInstance("BETA");
		Triple c1 = Triple.getInstance("GAMMA");
		Triple a2 = Triple.getInstance("ALPHA");
		Triple b2 = Triple.getInstance("BETA");
		Triple c2 = Triple.getInstance("GAMMA");

		if (a1 == a2) {
			System.out.println(a1 + "一致しました");
		} else {
			System.out.println("一致しませんでした");
		}

		if (b1 == b2) {
			System.out.println(b1 + "一致しました");
		} else {
			System.out.println("一致しませんでした");
		}

		if (c1 == c2) {
			System.out.println(c1 + "一致しました");
		} else {
			System.out.println("一致しませんでした");
		}

	}
}
