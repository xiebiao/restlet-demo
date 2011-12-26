package com.xiebiao.restlet.main;

import org.restlet.Application;
import org.restlet.Context;
import org.restlet.Restlet;
import org.restlet.routing.Router;

import com.xiebiao.restlet.resources.UserResource;

public class App extends Application {
	public App(Context con) {
		super(con);
	}

	public App() {
		// super();
	}

	@Override
	public synchronized Restlet createInboundRoot() {
		Router router = new Router(getContext());
		router.attach("/first", UserResource.class);
		return router;
	}
}
