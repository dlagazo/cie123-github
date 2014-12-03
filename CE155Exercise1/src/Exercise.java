

import java.util.ArrayList;
import java.util.Scanner;
class Runnable1 implements Runnable{
	private Thread t;
	private String msg;
	private int counter = 0;
	Runnable1(String msg)
	{
		this.msg = msg;
	}
	public void run() {
		while(true)
		{
			System.out.println(msg);
			try {
				Thread.sleep(500);
				
			} catch (InterruptedException e) {}		
			counter++;
			if(msg.equals("thread2") && counter==3)
				this.stop();
			if(msg.equals("thread3") && counter==4)
				this.waitForInput();
			if(msg.equals("thread4") && counter==5)
				{
					this.stop();
					this.destroy();
				}
		}
	}
	public void start()
	{
		System.out.println("Starting a new thread");
		t = new Thread(this, "Thread");
		t.start();
		
	}
	public void waitForInput()
	{
		System.out.println("Please type something to continue " + msg );
		Scanner in = new Scanner(System.in);
		in.nextLine();
	}
	public void stop()
	{
		t.stop();
	}
	
	public void destroy()
	{
		t.destroy();
	}
}
public class Exercise {
	
	public static void main(String[] args)
	{
		for(int i=0; i < 5; i++)
		{
			Runnable1 thread = new Runnable1("thread" + i);
			thread.start();
			
		}
	}
	
	
	
	
	
	
	
}
































