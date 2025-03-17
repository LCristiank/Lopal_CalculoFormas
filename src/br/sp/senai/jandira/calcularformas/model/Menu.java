package br.sp.senai.jandira.calcularformas.model;

import java.util.Scanner;

public class Menu {
	public static void criarMenu() {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("==================");
		System.out.println("1. Quadrado");
		System.out.println("2. Triângulo");
		System.out.println("3. Trapezio");
		System.out.println("4. Quadrado");
		System.out.println("5. Circuferencia");
		System.out.println("------------------");
		System.out.println("Escolha qual forma deseja calcular... (1- 5)");
		
		int opcao = leitor.nextInt();
		
		if (opcao == 2) {
			CalculoDePoligonos.calcularRetangulo();
		} else {
			System.out.println("A opção solicitada ainda não foi implementada.");
		}
	}

}
