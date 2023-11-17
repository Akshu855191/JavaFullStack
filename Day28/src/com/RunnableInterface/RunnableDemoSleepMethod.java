package com.RunnableInterface;

public class RunnableDemoSleepMethod implements Runnable {
	   Thread t1 = new Thread();
			public void run() {
				for(int j = 0, i = 'A'; i < 150; j++, i++) {
					try {
						t1.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
				     }
					if(j < 10) {
						System.out.println(j);
					}
					System.out.println((char) i);
				
					}

		}
      public static void main(String[] args) {
		RunnableDemoSleepMethod rs = new RunnableDemoSleepMethod();
		Thread t1 = new Thread(rs);
		t1.start();
	}
      
   

}


