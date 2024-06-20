package org.example;

public class Task {
    private String title;
    private String description;

    public Task(String title, String description){
        this.title = "get groceries";
        this.description = "buy eggs, bread, milk";
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

}
