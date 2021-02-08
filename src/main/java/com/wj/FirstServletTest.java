package com.wj;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import java.io.File;

/**
 * Created by wenjing.liu on 2021/2/8 in J1.
 * 用代码来启动Tomcat
 */

public class FirstServletTest {
    public static void main(String[] args) throws LifecycleException {
        //创建Tomcat
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(Integer.getInteger("port", 8080));
        tomcat.getConnector();
        //创建webapp
        Context context = tomcat.addWebapp("", new File("src/main/webapp").getAbsolutePath());
        WebResourceRoot resources = new StandardRoot(context);
        DirResourceSet set = new DirResourceSet(resources, "/WEB-INF/classes", new File("target/classes").getAbsolutePath(), "/");
        resources.addPreResources(set);
        context.setResources(resources);
        //启动Tomcat
        tomcat.start();
        tomcat.getServer().await();

    }
}
