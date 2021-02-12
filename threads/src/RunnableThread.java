
public class RunnableThread implements Runnable 
{
	@Override
	public void run() 
	{
		System.out.println("Child Thread2 ThreadId: " +
		Thread.currentThread().getId());
		// Trabajo a realizar por el hilo
		PrintNumbers.printNumbers();
	}

	static public void main(String[] args) 
	{
		System.out.println("Main ThreadId: " + Thread.currentThread().getId());
		for(int i=0; i<3; i++) 
		{
			new Thread(new RunnableThread()).start();
			// De nuevo, No invocar directamente a run!
			// si se quiere tener un hilo concurrente
		}
		PrintNumbers.printNumbers();
	}

}
