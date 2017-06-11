package com.statestr.PrimaryNumberCheck;

import java.util.concurrent.SynchronousQueue;

public class PrimeVeriferService {

    public static void main(String[] args) {
    	SynchronousQueue<Message> primeQ = new SynchronousQueue<Message>();
    	SynchronousQueue<Integer> randomQ = new SynchronousQueue<Integer>();

        Randomizer randomizer = new Randomizer(randomQ, primeQ);
        PrimeVerifier primerVerifier = new PrimeVerifier(randomQ, primeQ);

        for (int i = 0; i < 10 ; i++) {
        	new Thread(randomizer).start();
        	new Thread(primerVerifier).start();
        }
    }

}