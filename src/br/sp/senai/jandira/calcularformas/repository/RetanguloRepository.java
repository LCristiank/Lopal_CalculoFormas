package br.sp.senai.jandira.calcularformas.repository;

import java.util.Scanner;

import br.sp.senai.jandira.calcularformas.model.Retangulo;

public class RetanguloRepository {
	public void criarRetangulo() {
		Scanner leitor = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("+----------------------------+");
		System.out.println("Criando um Retangulo...");
		System.out.println("+----------------------------+");
		
		System.out.print("Informe a Altura:");
		retangulo.setAltura(leitor.nextDouble());
		System.out.print("Informa agora a Base:");
		retangulo.setBase(leitor.nextDouble());
		
		retangulo.mostrarDados();
		leitor.close();
	}
}
