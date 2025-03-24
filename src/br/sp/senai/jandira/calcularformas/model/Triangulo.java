package br.sp.senai.jandira.calcularformas.model;

public class Triangulo {
	private double catetoA;
	private double catetoB;
	private double catetoC;
	private double area;
	
	public void mostrarDados() {	
		System.out.println("==========================");
		System.out.printf("Forma Geometrica: Triângulo \n");
		System.out.printf("Base: %s \n", catetoA);
		System.out.printf("Altura: %s \n", catetoB);
		System.out.printf("Area: %s \n", area);
	}
}
