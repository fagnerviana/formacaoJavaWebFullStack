package formacaoJavaWebFullStack.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog{
	private JPanel jPanel = new JPanel(new GridBagLayout());//Painel de componentes
	private JLabel descricaoHora = new JLabel("Time Thread 1");
	private JLabel descricaoHora2 = new JLabel("Time Thread 2");
	private JTextField mostraTempo = new JTextField();
	private JTextField mostraTempo2 = new JTextField();	
	private JButton buttonStart = new JButton("Start");
	private JButton buttonStop = new JButton("Stop");
	
	//Thread criada Start do tempo 1
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {			
			while (true) {
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss")
						.format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};
	
	//Thread criada para marcar o Tempo 2
	private Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			
			while(true) {
				mostraTempo2.setText(new SimpleDateFormat("dd-MM-yyyy hh:mm:ss")
						.format(Calendar.getInstance().getTime()));			
			
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	  }
	};
	
	//Instanciar a Thread 
	private Thread thread1Time;
	private Thread thread2Time;
	
	
	//Contrutor
	public TelaTimeThread() {
		
		setTitle("Minha Tela de time com thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		/*Primeira parte concluida*/

		GridBagConstraints gridBagConstraints = new GridBagConstraints();// Controla posicionamento dos componentes
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth=2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor= GridBagConstraints.WEST;
		

		// mostra descrição e mostra o tempo
		// Apresenta na tela a descrição
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);
		
		// mostra o tempo na tela
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostraTempo.setEditable(false);
		jPanel.add(mostraTempo, gridBagConstraints);
		
		
		// Apresenta na tela a descrição da hora 2
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHora2, gridBagConstraints);
		// mostra tempo 2 na tela
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostraTempo2.setEditable(false);
		jPanel.add(mostraTempo2, gridBagConstraints);
		
		//Espaçamento do entre as colunas
		gridBagConstraints.gridwidth=1;
		
		//Botao start com o seu tamanho 
		buttonStart.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridy++;
		jPanel.add(buttonStart,gridBagConstraints);
		
		//Botao stop com o seu tamanho
		buttonStop.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridx++;
		jPanel.add(buttonStop,gridBagConstraints);
		
		buttonStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time = new Thread(thread1);
				thread1Time.start();
				thread2Time = new Thread(thread2);
				thread2Time.start();
				buttonStop.setEnabled(true);
				buttonStart.setEnabled(false);
				
			}
		});
		
		buttonStop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time.stop();
				thread2Time.stop();
				buttonStop.setEnabled(false);
				buttonStart.setEnabled(true);
			}
		});
		
		buttonStop.setEnabled(false);
		buttonStart.setEnabled(true);

		add(jPanel,BorderLayout.WEST);		
		setVisible(true);//Este comando sempre será o ultimo a ser executado.
	}
}