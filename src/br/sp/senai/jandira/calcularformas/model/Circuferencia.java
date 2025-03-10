package br.sp.senai.jandira.calcularformas.model;

import java.util.Set;

public class Circuferencia {
	private double raio;
	
	public void setRaio(double raio){
		if (raio > 0) {
			this.raio = raio;
		} else {
			System.out.println("Valor invalido");
		}
	}
	public double getRaio() {
		return raio;
	}
	Set<E>
	set
	
	public double calcularCircuferencia() {
		double resultCircuferencia = 3.14 * (raio * raio);
		return resultCircuferencia;
	}
	public void mostrarDados() {
		double resultCircuferencia = calcularCircuferencia();
		
		System.out.println("==========================");
		System.out.printf("Forma Geometrica: Circulo \n");
		System.out.printf("Raio: %s \n", raio);
		System.out.printf("Circuferencia: %s \n", resultCircuferencia);
	}
}
