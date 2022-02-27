package com.ruslooob.behavioral.memento;

public class GithubRepo {
    private ProjectSnapshot projectSnapshot;

    public ProjectSnapshot getProjectSnapshot() {
        return projectSnapshot;
    }

    public void push(ProjectSnapshot projectSnapshot) {
        this.projectSnapshot = projectSnapshot;
    }

}
