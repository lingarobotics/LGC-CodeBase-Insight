package com.lgc.codebaseinsight.learning.model;

public class Codebase {

    private String name;
    private String description;
    private String repositoryUrl;

    public Codebase() {
    }

    public Codebase(String name, String description, String repositoryUrl) {
        this.name = name;
        this.description = description;
        this.repositoryUrl = repositoryUrl;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getRepositoryUrl() {
        return repositoryUrl;
    }

}