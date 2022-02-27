package com.ruslooob.behavioral.template_method;

public abstract class WebsiteTemplate {

    public void render() {
        System.out.println("Header");
        System.out.println(getContent());
        System.out.println("Footer");
    }

    protected abstract String getContent();
}
