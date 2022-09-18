package formacaoJavaWebFullStack.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

//Necessario extender THREAD
public class ImplementacaoFilaThread extends Thread {
	// Manter a pilhaFilha do objeto FilaThread,ConcurrentLinkedQueue criando a
	// pilha de filathread
	private static ConcurrentLinkedQueue<FilaThread> pilhaFihla = new ConcurrentLinkedQueue<FilaThread>();

	public static void add(FilaThread filaThread) {
		pilhaFihla.add(filaThread);

	}

	@Override
	public void run() {
		
		System.out.println("Fila rodando");
		
		while(true) {

		synchronized (pilhaFihla) {/* BLOQUEAR O ACESSO A ESTA LISTA POR OUTRO PROCESSO */
			Iterator iteracao = (Iterator) pilhaFihla.iterator();
			while (iteracao.hasNext()) { // enquanto conter dados na lista irá processar

				FilaThread processar = (FilaThread) iteracao.next();
				

				/* Processar notas fiscais */
				/* Gerar lista de PDF */
				/* Criar as rotinas */

				System.out.println("----------------------------------------");
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());

				iteracao.remove();

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			

		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		
	}
		
		
	/*
	public synchronized void start() {
		this.start();//Referencia para ImplementacaoFilaThread
	}*/
	}
	}
}
