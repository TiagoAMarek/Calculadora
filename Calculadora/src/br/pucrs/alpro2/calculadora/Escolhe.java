package br.pucrs.alpro2.calculadora;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Escolhe {
	  private JFrame tela;
	  private JPanel painelPrincipal;
	  private JOptionPane inputPanel;
	  private static String[][] listabotoes = {{"7","8","9","/"},
		  									   {"4","5","6","*"},
		  									   {"1","2","3","-"},
		  									   {"0","+"}};

	  
	public void montaTela(){
		preparaTela();
		preparaPainelPrincipal();
		preparaBotoes();
		mostraJanela();
	}
	
	private void mostraJanela() {
		  tela.pack();
		  tela.setSize(340, 340);
		  tela.setVisible(true);		
	}


	private void preparaBotoes() {
		int tamanhoArray = 0;
		for(int i = 0; i < listabotoes.length; i++){
			  tamanhoArray = listabotoes[i].length;
				for(int j = 0; j < tamanhoArray; j++){
				  JButton botaoCarregar = new JButton(listabotoes[i][j].toString());
				  botaoCarregar.setSize(100, 250);
				  painelPrincipal.add(botaoCarregar);
				}
		}
	}

	private void preparaPainelPrincipal() {
		  painelPrincipal = new JPanel();
		  tela.add(painelPrincipal);
		  inputPanel = new JOptionPane();
		  inputPanel.setSize(100, 100);
		  painelPrincipal.add(inputPanel);

	}

	public void preparaTela(){		
	   
		tela = new JFrame("Calculadora");
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
