	package oskgunnlaugs;

import ng.appserver.NGActionResults;
import ng.appserver.NGApplication;
import ng.appserver.NGRequest;
import ng.appserver.templating._NGUtilities;

public class Application extends NGApplication {

	public static void main(String[] args) {
		NGApplication.run(args, Application.class);
	}
	
	public Application() {
		_NGUtilities.addClass( Wrapper.class );
	}

	@Override
	public NGActionResults defaultResponse(NGRequest request) {
		return pageWithName(Main.class, request.context());
	}
}