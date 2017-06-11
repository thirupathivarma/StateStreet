package com.statestr.PrimaryNumberCheck;

import java.util.concurrent.SynchronousQueue;

public class PrimeVerifier implements Runnable {
	SynchronousQueue<Message> primeQ = new SynchronousQueue<Message>();
	SynchronousQueue<Integer> randomQ = new SynchronousQueue<Integer>();

	public PrimeVerifier(SynchronousQueue<Integer> randomIntQ, SynchronousQueue<Message> isPrimeQ) {
		this.primeQ = isPrimeQ;
		this.randomQ = randomIntQ;
	}

	boolean isPrime(int n) {
		if (n % 2 == 0)
			return false;
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	@Override
	public void run() {
		try {
			Integer rInteger = randomQ.take();
			primeQ.put(new Message(rInteger, isPrime(rInteger)));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}