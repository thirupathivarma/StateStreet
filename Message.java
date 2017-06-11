package com.statestr.PrimaryNumberCheck;

public class Message {
    private int number;
    private boolean prime;
    
    public Message(int number, boolean isPrime){
        this.number = number;
        this.prime = prime;
    }

    public String toString() {
    	return "number:" + number + " isPrime:" + prime;
    }
    public Message getMsg() {
        return this;
    }
}