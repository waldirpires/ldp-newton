package edu.newton.ldp.u4.lab3.exemplo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExemploNavegacao {

	// --------------------------Modelo-----------------------------
	private static List<String> nomes = new ArrayList<String>();
	private static int index = 0;
	
	// --------------------------------------------------------------------	
    private static void createAndShowGUI() {
    	// ----------------------VISÃO ------------------------------------
    	
        JFrame frame = new JFrame("FrameDemo: " + nomes.size());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel indice = new JLabel("Índice :" + index + "/" + nomes.size());
        frame.getContentPane().add(indice, BorderLayout.NORTH);
        
        // botões
        JButton avancar = new JButton("Avançar");
        JButton voltar = new JButton("Voltar");
        JButton salvar = new JButton("Salvar");
        JButton excluir = new JButton("Excluir");
        
        // painel dos botoes
        JPanel painelBotoes = new JPanel(new FlowLayout());
        painelBotoes.add(voltar);
        painelBotoes.add(avancar);
        painelBotoes.add(salvar);
        painelBotoes.add(excluir);
        // adicionando o painel dos botoes na tela
        frame.getContentPane().add(painelBotoes, BorderLayout.SOUTH);
        
        JTextField texto = new JTextField(30);
        frame.getContentPane().add(texto, BorderLayout.CENTER);
        
        frame.pack();
        frame.setVisible(true);
        
        // -------------------------------------------------------------
        
        // ------------------------------CONTROLE----------------------- 
        
        salvar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				var nome = texto.getText();
				System.out.println("Leu da tela: " + nome);
				
				if (nome.trim().isBlank()) {
					return;
				}
				
				nomes.add(nome);
				
				System.out.println(nomes);
				
				indice.setText("Índice :" + index + "/" + nomes.size());
				frame.setTitle("FrameDemo: " + nomes.size());
				
				excluir.setEnabled(!nomes.isEmpty());
			}
		});
        
        avancar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				index++;
				System.out.println("Indice: "+ index);
				if (index < nomes.size()) {
					texto.setText(nomes.get(index));					
				} else {
					index = nomes.size();
					texto.setText("");
				}
				indice.setText("Índice :" + index + "/" + nomes.size());
			}
		});
        
        voltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				index--;
				if (index >= 0) {
					texto.setText(nomes.get(index));										
				} else {
					index = 0;
				}
				System.out.println("Indice: "+ index);				
				indice.setText("Índice :" + index + "/" + nomes.size());
			}
		});
        
        excluir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				var nome = texto.getText();
				if (nome.trim().isBlank()) {
					return;
				}
				
				if (index < nomes.size()) {
					nomes.remove(nome);
					index--;
				}
				
				if (index < 0) {
					index = 0;
				}

				if (nomes.size() > 0 && index < nomes.size()) {
					texto.setText(nomes.get(index));
				} else {
					texto.setText("");
				}

				System.out.println(nomes);
				System.out.println("Indice: "+ index);				

				indice.setText("Índice :" + index + "/" + nomes.size());
				frame.setTitle("FrameDemo: " + nomes.size());

				excluir.setEnabled(!nomes.isEmpty());
				
			}
		});
        excluir.setEnabled(false);
        
        // ---------------------------------------------------------------
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	createAndShowGUI();
            }
        });
    }
}
