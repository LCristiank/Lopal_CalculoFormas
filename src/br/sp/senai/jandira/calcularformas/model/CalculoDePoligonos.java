package br.sp.senai.jandira.calcularformas.model;

import java.util.Scanner;

public class CalculoDePoligonos {
	static Scanner leitor = new Scanner(System.in);
	
	public static void calcularQuadrado() {
		Quadrado quadrado = new Quadrado();
		
		System.out.println("Tamanho do Lado do Quadrado:");
		double lado = leitor.nextDouble();
		
		quadrado.setLado(lado);
	}
	public static void calcularRetangulo() {
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Altura do Retãngulo:");
		double altura = leitor.nextDouble();
		
		System.out.println("Base do Retãngulo:");
		double base = leitor.nextDouble();
		
		retangulo.setAltura(altura);
		retangulo.setBase(base);
		retangulo.mostrarDados();
		
		leitor.close();
	}
}
