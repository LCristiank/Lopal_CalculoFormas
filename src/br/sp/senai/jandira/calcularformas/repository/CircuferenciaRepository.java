package br.sp.senai.jandira.calcularformas.repository;

import java.util.Scanner;

import br.sp.senai.jandira.calcularformas.model.Circuferencia;

public class CircuferenciaRepository {
	public void criarCirculo() {
		Scanner leitor = new Scanner(System.in);
		Circuferencia circulo = new Circuferencia();
		
		System.out.println("+----------------------------+");
		System.out.println("Criando um circulo....");
		System.out.println("+----------------------------+");
		System.out.print("Qual o raio do circulo:");
		
		circulo.setRaio(leitor.nextDouble());
		circulo.mostrarDados();
		
		leitor.close();
	}
}
