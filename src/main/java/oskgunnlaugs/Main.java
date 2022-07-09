package oskgunnlaugs;

import java.util.List;

import ng.appserver.NGComponent;
import ng.appserver.NGContext;

public class Main extends NGComponent {

	public String currentItem;
	public List<String> items = List.of("1.png", "2.png", "3.png");

	public Main(NGContext context) {
		super(context);
	}
}