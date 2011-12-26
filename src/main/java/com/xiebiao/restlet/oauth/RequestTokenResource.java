package com.xiebiao.restlet.oauth;

import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class RequestTokenResource extends ServerResource {
	private String consumer_secret;
	private String oauth_consumer_key;
	private String oauth_signature_method = "HMAC-SHA1";
	private String oauth_version;
	private String oauth_callback;

	@Get
	public Representation get() {
		return null;
	}
}
