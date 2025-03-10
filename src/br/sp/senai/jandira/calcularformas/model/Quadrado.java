package br.sp.senai.jandira.calcularformas.model;

public class Quadrado {
	public double lado;
	
	public void setLado(double lado) {
		if (lado > 0) {
			this.lado = lado;
		} else {
			System.out.println("Valor Inválido");
		}
	}
	public double getLado(){
		return lado;
	}
	
	public double calcularArea() { 
		double area = lado * lado;
		return area;
	}
	public double calcularPerimetro() {
		double perimetro = lado * 4;
		return perimetro;
	}
	
	public void mostrarDados() {
		double resultArea = calcularArea();
		double resultPerimetro = calcularPerimetro();
		
		System.out.println("==========================");
		System.out.printf("Forma Geometrica: Retangulo \n");
		System.out.printf("Lado: %s \n", lado);
		System.out.printf("Area: %s \n", resultArea);
		System.out.printf("Perimetro: %s \n", resultPerimetro);
	}
	
}
