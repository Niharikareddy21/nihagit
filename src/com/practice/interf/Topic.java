package com.practice.interf;

public interface Topic 
{ 
    void understand(); 
} 
class Topic1 implements Topic { 
public void understand() 
    { 
        System.out.println("Got it"); 
    } 
} class Topic2 implements Topic { 
public void understand() 
    { 
        System.out.println("understand"); 
    }
}
