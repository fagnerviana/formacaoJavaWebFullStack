package formacaoJavaWebFullStack.thread;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicTableHeaderUI;

public class ThreadTestes {

	public static void main(String[] args) throws InterruptedException {
		
		String msg = "Super Promoção de Lanche";
		String atencao ="Atenção Promoção Valida até Hoje !";
		
		
		String[] msgFinal = msg.split(" ");
		
		//Thread processando em paralelo
		new Thread() {
		
			//Executa o que nos precisamos
			public void run() { 
				//Codigo da rotina que eu quero executar em paralelo
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
				
			}
			
			
			
		}.start();//Start liga a thread que  fica processando paralelamente por trás
		
		
		new Thread() {
			
			//Executa o que nos precisamos
			public void run() { 
				//Codigo da rotina que eu quero executar em paralelo
				for (int i = 0; i <11; i++) {
					
					//Quero executar com tempo de para ou com o tempo determinado 
					
					System.out.print("\nEnvio de Nota Fiscal");
					 
					  try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}//Dá um tempo
						//System.out.println("Mensagem enviada com sucesso "+i);
					    /* for(int j=0;j<i;j++) {
					   	//System.out.println(atencao);
					   	Thread.sleep(1000);
					  }*/
										
						
					}	
				
			}
			
			
			
		}.start();//Start liga a thread que  fica processando paralelamente por trás

		

	}

}
