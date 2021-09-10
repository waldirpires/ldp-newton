package edu.newton.ldp.u3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
        painel.add(painelNorte, BorderLayout.NORTH);
        
        
        var painelCentro = new JPanel(new GridLayout(2, 1));
        var celsius = new JRadioButton("Celsius");
        painelCentro.add(celsius);
        var fahrenheit = new JRadioButton("fahrenheit");
        painelCentro.add(fahrenheit);
        painel.add(painelCentro, BorderLayout.CENTER);
        
        
        // resultado
        var labelResultado = new JLabel("Resultado:");
        var resposta = new JTextField("70");
        resposta.setEditable(false);

        var painelSul = new JPanel(new FlowLayout());
        painelSul.add(labelResultado);
        painelSul.add(resposta);
        painel.add(painelSul, BorderLayout.SOUTH);
        
		// - adicionar o componente na janela de acordo com o gerenciador de layout
		
		// mandar exibir a tela com os componentes
        frame.pack();
        frame.setVisible(true);

	}

}
