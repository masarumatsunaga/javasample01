package adapterpractice1;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
//		File file = new File("test.txt");
//		if (file.exists() == false) {
//			file.createNewFile();
//		}
		FileIO f = new FileProperties();
		try {
			f.readFromFile("test.txt");
			f.setValue("width", "1024");
			f.setValue("height", "512");
			f.setValue("depth", "32");
			f.writeToFile("newfile.txt");
			System.out.println("newfile.txt is created.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
