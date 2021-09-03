package edu.newton.ldp.u2.poo;

public class Main {

	private static void zerarKm(Automovel a) {
		a.km = 0;
	}	
	
	public static void main(String[] args) {
		var mercedes = new Automovel(); // 
		
		mercedes.ano = 2021;
		mercedes.cor = "preta";
		mercedes.km = 100000;
		mercedes.marca = "mercedes";
		mercedes.modelo = "CLK";
		mercedes.portas = 2;
		
		mercedes.acelerar();
		
		mercedes.acelerar();
		
		mercedes.desacelerar();
		
		mercedes.parar();
		
		zerarKm(mercedes);
		
		System.out.println("done");
	}
}
