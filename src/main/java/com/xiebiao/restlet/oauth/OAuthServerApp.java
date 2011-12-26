package com.xiebiao.restlet.oauth;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class OAuthServerApp extends Application {
	public OAuthServerApp() {
	}

	@Override
	public synchronized Restlet createInboundRoot() {
		Router router = new Router(getContext());
		router.attach("/request_token", RequestTokenResource.class);
		return router;
	}
}
