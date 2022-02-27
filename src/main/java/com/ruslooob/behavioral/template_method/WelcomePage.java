package com.ruslooob.behavioral.template_method;

public class WelcomePage extends WebsiteTemplate {

    @Override
    protected String getContent() {
       return "Welcome in our site";
    }

}
