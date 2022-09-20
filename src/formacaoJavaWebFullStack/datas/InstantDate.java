package formacaoJavaWebFullStack.datas;

import java.time.Duration;
import java.time.Instant;

public class InstantDate {

	public static void main(String[] args) throws InterruptedException {
		
		Instant inicio = Instant.now();
		
		Thread.sleep(2000);//Pode um processo com tempo qualquer que não conhecemos
		
		Instant ifinal=Instant.now();
		
		Duration duracao = Duration.between(inicio,ifinal);
		System.out.println("Duração em nano segundos : "+duracao.toNanos());
		System.out.println("Duração em minutos : "+duracao.toMinutes());
		System.out.println("Duração em horas : "+duracao.toHours());
		
		

	}

}
