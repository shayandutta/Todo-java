package com.todo.application.models;

public class Todo {
    private int id;
    private String title;
    private String content;
    private String status;  //enum data type can also be used for status


    public Todo(int id, String title, String content, String status){
        this.id = id;
        this.title = title;
        this.content = content;
        this.status = status;
    }


    //default constructor
    public Todo(){
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    //creating a toString method to get a proper output on console via logger

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
