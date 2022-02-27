package com.ruslooob.behavioral.memento;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GithubRepo gitHub = new GithubRepo();

        System.out.println("Creating new project version 1.0");
        project.setVersion("1.0");
        System.out.println(project);
        System.out.println("Save current version to GitHub");
        gitHub.push(project.getLastCommit());
        Thread.sleep(5000);
        System.out.println("Updating project to version 1.1");
        System.out.println("Writing pure code...");
        project.setVersion("1.1");
        System.out.println(project);
        System.out.println("Something went wrong...");
        System.out.println("Rolling back to version 1.0");
        project.rollback(gitHub.getProjectSnapshot());
        System.out.println("Project after rollback");
        System.out.println(project);
    }

}
