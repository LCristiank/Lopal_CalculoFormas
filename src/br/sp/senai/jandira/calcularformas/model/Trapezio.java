package br.sp.senai.jandira.calcularformas.model;

public class Trapezio {
	private double baseMaior;
	private double baseMenor;
	private double ladoUm;
	private double ladoDois;
	private double altura;
	
	public void setBaseMaior(double baseMaior) {
		if (baseMaior > 0 ) {
			this.baseMaior = baseMaior;
		} else {
			System.out.println("Informe um valor maior que 0");
		}
	}
	public void setBaseMenor(double baseMenor) {
		if (baseMenor > 0 ) {
			this.baseMenor = baseMenor;
		} else {
			System.out.println("Informe um valor maior que 0");
		}
	}
	public void setAltura(double altura) {
		if(altura > 0) {
			this.altura = altura;
		} else {
			System.out.println("Informe um valor maior que 0");
		}
	}
	
	public double getBaseMaior() {
		return baseMaior;
	}
	public double getBaseMenor() {
		return baseMenor;
	}
	public double getAltura() {
		return altura;
	}
	
	public double calcularArea() { 
		double area = (baseMaior + baseMenor) * altura / 2;
		return area;
	}
	
	public void mostrarDados() {
		double resultArea = calcularArea();
		
		System.out.println("==========================");
		System.out.printf("Forma Geometrica: Trapezio \n");
		System.out.printf("Base Maior: %s \n", baseMaior);
		System.out.printf("Base Menor: %s \n", baseMenor);
		System.out.printf("altura: %s \n", altura);
		System.out.printf("Area: %s \n", resultArea);
	} 
}
