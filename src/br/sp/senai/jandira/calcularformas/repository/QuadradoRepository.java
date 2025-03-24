package br.sp.senai.jandira.calcularformas.repository;

import java.util.Scanner;

import br.sp.senai.jandira.calcularformas.model.Quadrado;

public class QuadradoRepository {
	public void criarQuadrado() {
		Scanner leitor = new Scanner(System.in);
		Quadrado quadrado = new Quadrado();
		
		System.out.println();
		System.out.println("+----------------------------+");
		System.out.println("Criando um quadrado...");
		System.out.println("+----------------------------+");
		System.out.print("Qual a medida de um dos lados do quadrado:");
	
		quadrado.setLado(leitor.nextDouble());

		leitor.close();
		quadrado.mostrarDados();
	}
}
