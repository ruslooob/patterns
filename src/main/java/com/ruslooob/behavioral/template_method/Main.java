package com.ruslooob.behavioral.template_method;

public class Main {

    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate contactPage = new ContactPage();

        welcomePage.render();
        System.out.println();
        contactPage.render();
    }
}
