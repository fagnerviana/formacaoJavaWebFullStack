package formacaoJavaWebFullStack.thread;

public class ThreadRunnable {
	
	public static Runnable thread1 = new Runnable() {
		
		public void run() {
			for (int i = 0; i <10; i++) {
				
				//Quero executar com tempo de para ou com o tempo determinado 
				//JOptionPane.showMessageDialog(null, msgFinal[i]);
				  System.out.print("\nEnvio de email.");
				 
				  try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}//Dá um tempo
					//System.out.println("Mensagem enviada com sucesso "+i);
				    /* for(int j=0;j<i;j++) {
				   	//System.out.println(atencao);
				   	Thread.sleep(1000);
				  }*/
									
					
				}
			
		};
	}; 
	
	public static Runnable thread2 = new Runnable() {
		
			public void run() {
				
				//Codigo da rotina que eu quero executar em paralelo
				for (int i = 0; i <11; i++) {
					
					//Quero executar com tempo de para ou com o tempo determinado 
					
					System.out.print("\nEnvio de Nota Fiscal");
					 
					  try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}										
						
				}	
				
		};
		
	};

	public static void main(String[] args) {
		
		//instanciando a Thread 
		Thread enviaEmail = new Thread(thread1);
		Thread envioNotasFiscal =  new Thread(thread2);
		
		enviaEmail.start();
		envioNotasFiscal.start();
    }

}