package com.xiebiao.restlet.oauth;

import junit.framework.TestCase;

import org.scribe.builder.ServiceBuilder;
import org.scribe.builder.api.TwitterApi;
import org.scribe.oauth.OAuthService;

public class RequestTokenResourceTest extends TestCase {
	private String oauth_consumer_key = "aca77d2eb96f46e1b3353bc6743e8bfc";
	private String oauth_signature_method = "HMAC-SHA1";
	private String oauth_signature = "exxzU/tTbpdicmYHcyYh5kqgYgo=";
	private String oauth_timestamp = "1299569145";
	private String oauth_nonce = "yQDMuXvdcEfQs2Mzf3XcT1r36WTULJls";
	private String oauth_callback = "http://www.xiebiao.com";
	private String oauth_version = "1.0";

	public void testRequestToken() {
		OAuthService service = new ServiceBuilder()
        .provider(TwitterApi.class)
        .apiKey("your_api_key")
        .apiSecret("your_api_secret")
        .build();
	}
}
