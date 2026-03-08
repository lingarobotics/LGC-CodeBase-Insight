package com.lgc.codebaseinsight.learning.model;

import java.util.List;

public class Codebase {

    private String id;
    private String name;
    private String repository;
    private String language;
    private String framework;
    private String analyzedAsOf;

    private Architecture architecture;

    private List<String> entryPoints;
    private List<String> modules;
    private List<String> keyConcepts;

    private String notes;

}