
package com.company;

public class Window {
    private String state; // Open or closed
    Window(String s) {
        this.state=s;
    }
    public void open(){
        this.state="open";
    }
    public void close(){
        this.state="closed";
    }
    public String getState()
    {
        return state;
    }
}