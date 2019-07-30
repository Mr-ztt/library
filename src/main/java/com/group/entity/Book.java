package com.group.entity;

import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
public class Book {
    /*
        定义book信息
     */
    private int id;
    private String title; //书名
    private String content; //简介
    private String author;
    private String translator;//译者
    private String publisher;//出版商
    private Date pub_date;
    private String ISBN;
    private float price;
    private String text_path;//文本存储位置

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPub_date() {
        return pub_date;
    }

    public void setPub_date(Date pub_date) {
        this.pub_date = pub_date;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getText_path() {
        return text_path;
    }

    public void setText_path(String text_path) {
        this.text_path = text_path;
    }
}
