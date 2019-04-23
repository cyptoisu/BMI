/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author Pathum
 */
@Named(value = "bmi")
@ManagedBean
@ApplicationScoped
public class bmi {

    private String clientname;
    private double height;
    private double weight;
    private double bmi=0;
    
    
  
    
    public void bmi() {
        bmi= weight / (height*height);
        
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientame) {
        this.clientname = clientame;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void clear(){
 height = 0.0;
 weight=0.0;
 clientname="";
 bmi=0.0;
 
 }

   

   
    
}
