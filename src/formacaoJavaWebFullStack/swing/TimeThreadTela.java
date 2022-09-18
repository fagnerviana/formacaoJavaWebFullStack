package formacaoJavaWebFullStack.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import formacaoJavaWebFullStack.thread.FilaThread;
import formacaoJavaWebFullStack.thread.ImplementacaoFilaThread;

public class TimeThreadTela extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout());// Painel de componentes
	private JLabel descricaoNome = new JLabel("Nome");
	private JLabel descricaoEmail = new JLabel("E-mail");
	private JTextField mostraNome = new JTextField();
	private JTextField mostraEmail = new JTextField();
	private JButton buttonStart = new JButton("Start");
	private JButton buttonStop = new JButton("Stop");
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

	public TimeThreadTela() {

		setTitle("Tela Mostra Horario Atual");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);

		GridBagConstraints gridBagConstraints = new GridBagConstraints();// Controla posicionamento dos componentes
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;

		// mostra descrição e mostra o tempo
		// Apresenta na tela a descrição
		descricaoNome.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoNome, gridBagConstraints);

		// mostra o tempo na tela
		mostraNome.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostraNome.setEditable(true);
		jPanel.add(mostraNome, gridBagConstraints);

		// Apresenta na tela a descrição da hora 2
		descricaoEmail.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoEmail, gridBagConstraints);
		
		// mostra tempo 2 na tela
		mostraEmail.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		mostraEmail.setEditable(true);
		jPanel.add(mostraEmail, gridBagConstraints);

		//Espaçamento do entre as colunas
		gridBagConstraints.gridwidth=1;
		
		
		// Botao start com o seu tamanho
		buttonStart.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPanel.add(buttonStart, gridBagConstraints);

		// Botao stop com o seu tamanho
		buttonStop.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel.add(buttonStop, gridBagConstraints);
		
		
		buttonStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {//Executa o clique no botão
				
				if(fila==null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}
				
			for(int qtd=0;qtd<100;qtd++) {//Simulando 100 envios em massa
				FilaThread filaThread = new FilaThread();
				filaThread.setNome(mostraNome.getText());
				filaThread.setEmail(mostraEmail.getText()+" - "+qtd);
				
				fila.add(filaThread);
				
				
			}
			}
		});
		
		buttonStop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fila.stop();
				fila =null;
				
			}
		});

		fila.start();
		add(jPanel, BorderLayout.WEST);
		// Ativa a tela para apresentar na execução do codigo
		setVisible(true);

	}

}
