/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.goffity.test.maven.spring.mvc.model;

/**
 *
 * @author goffity
 */
public class User {

    private String name;
    private String message;

    public User(String name, String message) {
        this.name = name;
        this.message = message;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
