package com.xiebiao.restlet.resources;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.restlet.data.MediaType;
import org.restlet.ext.freemarker.TemplateRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class UserResource extends ServerResource {
    static Configuration cfg = new Configuration();

    public UserResource() {
	String templatesDir = System.getProperty("user.dir") + "/templates";
	System.out.println(templatesDir);
	try {
	    cfg.setDirectoryForTemplateLoading(new File(templatesDir));
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

    @Get
    public Representation doGet() {
	Template t;
	Representation r = null;
	try {
	    t = cfg.getTemplate("UserResource.ftl");
	    Map root = new HashMap();
	    root.put("user", "Big Joe");
	    Map latest = new HashMap();
	    root.put("latestProduct", latest);
	    latest.put("url", "products/greenmouse.html");
	    latest.put("name", "green mouse");
	    Writer out = new OutputStreamWriter(System.out);
	    t.process(root, out);
	    r = new TemplateRepresentation(t, MediaType.APPLICATION_XHTML);
	    out.flush();
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	return r;
    }
}
