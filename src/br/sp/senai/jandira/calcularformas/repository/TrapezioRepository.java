package br.sp.senai.jandira.calcularformas.repository;

import java.util.Scanner;

import br.sp.senai.jandira.calcularformas.model.Trapezio;

public class TrapezioRepository {
	public void criarTrapezio() {
		Scanner leitor = new Scanner(System.in);
		Trapezio trapezio = new Trapezio();
		
		System.out.println("+----------------------------+");
		System.out.println("Criando Trapzio...");
		System.out.println("+----------------------------+");
		System.out.print("Informe a Base Maior:");
		trapezio.setBaseMaior(leitor.nextDouble());
		System.out.println("Informe a Base Menor:");
		trapezio.setBaseMenor(leitor.nextDouble());
		System.out.println("Informe a Altura:");
		trapezio.setAltura(leitor.nextDouble());
		
		trapezio.mostrarDados();
		leitor.close();
	}
}
