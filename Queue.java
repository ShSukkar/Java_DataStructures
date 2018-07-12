/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_datastructures;

import java.util.ArrayList;

/**
 *
 * @author Shatha
 */
public class Queue {
    
    public ArrayList<Integer> storage = new ArrayList<Integer>();
    
    public void push(int pushedElement){
       this.storage.add(pushedElement);
    }
    public void pop(){
        this.storage.remove(0);
    }
    public void display(){
        System.out.println(this.storage);
    }
}
