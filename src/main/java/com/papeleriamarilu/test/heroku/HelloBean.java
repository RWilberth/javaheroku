/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.papeleriamarilu.test.heroku;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "helloWorld", eager = true)
public class HelloBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    
    public HelloBean(){        
      System.out.println("HelloWorld started!");
    }

    public String getName() {
            return name;
    }
    public void setName(String name) {
            this.name = name;
    }
    public String getMessage() {
       return "Hello man!";
    }
}
