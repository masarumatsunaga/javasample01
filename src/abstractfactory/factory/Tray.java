package abstractfactory.factory;

import java.util.ArrayList;
import java.util.List;
// 複数のLinkやTrayを集めてひとまとまりにしたものを表す
public abstract class Tray extends Item{
	protected List<Item> tray = new ArrayList<>();

	public Tray(String caption) {
		super(caption);
	}

	public void add(Item item) {
		tray.add(item);
	}

}
