
public class ExtendedThread extends Thread 
{
	@Override
	public void run() 
	{
		System.out.println("Child Thread ThreadId: " + Thread.currentThread().getId());
		// Trabajo a realizar por el hilo
		PrintNumbers.printNumbers();
		// El método super no hace nada, solo se invoca por buenas prácticas de programación
		super.run();
	}

	static public void main(String[] args) 
	{
		System.out.println("Main ThreadId: " + Thread.currentThread().getId());
		for(int i=0; i<3; i++) 
		{
			new ExtendedThread().start(); // No llamar a run!, si se quire tener un hilo concurrente
		}
		PrintNumbers.printNumbers();
	}
}



