package com.statestr.PrimaryNumberCheck;

import java.util.Random;
import java.util.concurrent.SynchronousQueue;

public class Randomizer implements Runnable{

	Random rand = new Random();

	SynchronousQueue<Message> primeQ = new SynchronousQueue<Message>();
	SynchronousQueue<Integer> randomQ = new SynchronousQueue<Integer>();

	public Randomizer(SynchronousQueue<Integer> randomIntQ,
			SynchronousQueue<Message> isPrimeQ) {
		this.primeQ = isPrimeQ;
		this.randomQ = randomIntQ;
	}

	@Override
	public void run() {
		int  n = rand.nextInt(5000) + 1;
		try{
			randomQ.put(n);

			Message msg = primeQ.take();
			System.out.println(msg.getMsg());
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}