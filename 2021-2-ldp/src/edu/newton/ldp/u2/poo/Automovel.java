package edu.newton.ldp.u2.poo;

public class Automovel {
	
	// propriedades de um automovel
	int portas;
	String cor;
	String marca;
	String modelo;
	int ano;
	int km;
	int velocidade; // km/h
	
	public void acelerar() {
		velocidade = velocidade + 10;
	}
	
	public void desacelerar() {
		velocidade = velocidade - 10;
	}
	
	public void parar() {
		velocidade = 0;
	}
	
}
