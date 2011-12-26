package com.xiebiao.restlet.main;

import org.restlet.Component;
import org.restlet.data.Protocol;

import com.xiebiao.restlet.oauth.OAuthServerApp;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Component com = new Component();
			com.getServers().add(Protocol.HTTP, 8080);
			// com.getDefaultHost().attach("/test", new App(com.getContext()));

			// Restlet that simply replies to requests with an "hello, world"
			// text message
			// Restlet restlet = new Restlet() {
			// @Override
			// public void handle(Request request, Response response) {
			// response.setEntity(new StringRepresentation("hello, world",
			// MediaType.TEXT_PLAIN));
			// }
			// };
			// Guard the restlet with BASIC authentication.
			// ChallengeAuthenticator guard = new ChallengeAuthenticator(null,
			// ChallengeScheme.HTTP_BASIC, "testRealm");
			// Instantiates a Verifier of identifier/secret couples based on a
			// simple Map.
			// MapVerifier mapVerifier = new MapVerifier();
			// Load a single static login/secret pair.
			// mapVerifier.getLocalSecrets().put("login",
			// "secret".toCharArray());
			// guard.setVerifier(mapVerifier);
			// guard.setNext(restlet);

			// com.getDefaultHost().attachDefault(guard);
			com.getDefaultHost().attach("/test", new App());
			com.getDefaultHost().attach("/oauth", new OAuthServerApp());
			com.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
