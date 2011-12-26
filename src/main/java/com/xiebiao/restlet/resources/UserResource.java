package com.xiebiao.restlet.resources;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.restlet.data.MediaType;
import org.restlet.ext.freemarker.TemplateRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import freemarker.template.Configuration;

public class UserResource extends ServerResource {
    static Configuration cfg = new Configuration();

    public UserResource() {
	String templatesDir = System.getProperty("user.dir") + "/templates";
	try {
	    cfg.setDirectoryForTemplateLoading(new File(templatesDir));
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

    @Get
    public Representation doGet() {
	Representation r = null;
	try {
	    Map root = new HashMap();
	    root.put("user", "Big Joe");	   
	    r = new TemplateRepresentation("UserResource.ftl",cfg,root, MediaType.TEXT_HTML);
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	return r;
    }
}
