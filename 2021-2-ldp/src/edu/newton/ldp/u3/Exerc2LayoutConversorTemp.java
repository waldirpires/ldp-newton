package edu.newton.ldp.u3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * Problema:
 * Entrada: um valor real digitado pelo usuário (temperatura em celsius ou fahrenheit)
 * Saída: exibir a temperatura convertida
 * 
 * Ex: 30o celsius
 * Saída: 70o fahrenheit
 * 
 * Objetivo: construir a interface gráfica de usuário (somente a janela)
 * 
 * ==================================================
 * [label]: [caixa de texto]
 * () Celsius
 * () Fahrenheit
 * 
 * [Resultado]: [ 70o fahrenheit] 
 * ==================================================
 * 
 * @author wrpires
 *
 */
public class Exerc2LayoutConversorTemp {

	public static void main(String[] args) {
		// criar a janela
        JFrame frame = new JFrame("ConversorTemp");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// definir os atributos da janela
        frame.setSize(600, 400);
		
        var painel = frame.getContentPane();
        
		// para cada componente da janela:
		// - criar o componente com as propriedades
        var painelNorte = new JPanel(new FlowLayout());
        var label = new JLabel("Digite uma temperatura:");
        painelNorte.add(label);
        
        var entrada = new JTextField(5);
        painelNorte.add(entrada);
        
//        var comboTipo = new JComboBox<String>();
//        comboTipo.addItem("Celsius");
//        comboTipo.addItem("Fahrenheit");
//        painelNorte.add(comboTipo);
        
        painel.add(painelNorte, BorderLayout.NORTH);
        
        
        var painelCentro = new JPanel(new GridLayout(3, 1));
        var celsius = new JRadioButton("Celsius");
        painelCentro.add(celsius);
        var fahrenheit = new JRadioButton("fahrenheit");
        
        // criar um grupo de botoes para fazzer a logica de selecao unica
        var grupo = new ButtonGroup();
        grupo.add(celsius);
        grupo.add(fahrenheit);

        var painelGrupo = new JPanel();
        painelGrupo.add(celsius);
        painelGrupo.add(fahrenheit);
        
        painelCentro.add(painelGrupo);
        
        var botao = new JButton("Ok");
        
        painelCentro.add(botao);
        
        painel.add(painelCentro, BorderLayout.CENTER);
        
        
        // resultado
        var labelResultado = new JLabel("Resultado:");
        var resposta = new JLabel("100");

        var painelSul = new JPanel(new FlowLayout());
        painelSul.add(labelResultado);
        painelSul.add(resposta);
        painel.add(painelSul, BorderLayout.SOUTH);
        
		// - adicionar o componente na janela de acordo com o gerenciador de layout
		
		// mandar exibir a tela com os componentes
        frame.pack();
        frame.setVisible(true);

        botao.addActionListener(new ActionListener() {
        	
			@Override
			public void actionPerformed(ActionEvent e) {
				
	        	String selected = "";
				if (celsius.isSelected()) {
					selected = "Celsius";
				} else if (fahrenheit.isSelected()) {
					selected = "Fahrenheit";
				} else {
					JOptionPane.showMessageDialog(frame, "Por favor, Selecione um tipo.");
					return;
				}
	        					
				System.out.println("Temperatura informada: " + entrada.getText() + " " + selected);
				
				// F = C * 1.8 + 32
				float f = Float.parseFloat(entrada.getText()) * 1.8f + 32;
				
				// C = (F-32) / 1.8
				float c = (Float.parseFloat(entrada.getText()) - 32) / 1.8f;
				
				if (selected.equals("Celsius")) {
					resposta.setText(f + " Fahrenheit");
				} else {
					resposta.setText(c + " Celsius");
				}
				
				System.out.println(resposta.getText());
			}
		});
        
        
	}

}
