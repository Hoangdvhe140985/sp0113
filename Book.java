/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;

/**
 *
 * @author MSI GF63
 */
public class Book {
    private String code, name, author, publisher;
    private int indexYear;
    private boolean forrent;

    public Book() {
    }

    public Book(String code, String name, String author, String publisher, int indexYear, boolean forrent) {
        this.code = code;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.indexYear = indexYear;
        this.forrent = forrent;
    }

    

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getIndexYear() {
        return indexYear;
    }

    public void setIndexYear(int indexYear) {
        this.indexYear = indexYear;
    }

    

    public boolean isForrent() {
        return forrent;
    }

    public void setForrent(boolean forrent) {
        this.forrent = forrent;
    }
    
}
