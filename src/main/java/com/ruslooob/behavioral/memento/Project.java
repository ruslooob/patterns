package com.ruslooob.behavioral.memento;

import java.time.LocalDateTime;

public class Project {
    private String version;
    private LocalDateTime localDateTime;

    public Project() {
    }

    public void setVersion(String version) {
        this.version = version;
        this.localDateTime = LocalDateTime.now();
    }

    public ProjectSnapshot getLastCommit() {
        return new ProjectSnapshot(version, localDateTime);
    }

    public void rollback(ProjectSnapshot snapshot) {
        this.version = snapshot.version();
        this.localDateTime = snapshot.localDateTime();
    }

    @Override
    public String toString() {
        return "Project{" + "version='" + version + '\'' + ", localDateTime=" + localDateTime + '}';
    }

}
