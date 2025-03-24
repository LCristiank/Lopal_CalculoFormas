package br.sp.senai.jandira.calcularformas.ui;
import br.sp.senai.jandira.calcularformas.model.*;
import br.sp.senai.jandira.calcularformas.repository.CircuferenciaRepository;
import br.sp.senai.jandira.calcularformas.repository.QuadradoRepository;
import br.sp.senai.jandira.calcularformas.repository.RetanguloRepository;
import br.sp.senai.jandira.calcularformas.repository.TrapezioRepository;

import java.util.Scanner;

public class Menu {
	public static void criarMenu() {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("==================");
		System.out.println("1. Quadrado");
		System.out.println("2. Retangulo");
		System.out.println("3. Trapezio");
		System.out.println("4. Triangulo");
		System.out.println("5. Circuferencia");
		System.out.println("6. Fechar/Sair");
		System.out.println("------------------");
		System.out.println("Escolha uma opção.. (1- 6)");
		
		int opcao = leitor.nextInt();
	
		
		if (opcao == 1) {
			QuadradoRepository novoQuadrado = new QuadradoRepository();
			novoQuadrado.criarQuadrado();
		} else if (opcao == 2) {
			RetanguloRepository novoRetangulo = new RetanguloRepository();
			novoRetangulo.criarRetangulo();
		} else if (opcao == 3) {
			TrapezioRepository novoTrapezio = new TrapezioRepository();
			novoTrapezio.criarTrapezio();
		} else if (opcao == 5){
			CircuferenciaRepository novaCircuferencia = new CircuferenciaRepository();
			novaCircuferencia.criarCirculo();
		} else if (opcao == 6){
			System.out.println("+--------------------------+");
			System.out.print("Tem certeza que quer sair (S/N)");
			String escolha = leitor.next();
			System.out.println("+--------------------------+");

			if (escolha .equalsIgnoreCase("s")) {
				System.out.println("Encerrando o Sistema....");
				System.out.println("+--------------------------+");
				System.exit(0);
			} else if(escolha.equalsIgnoreCase("n")){
				criarMenu();
			} else {
				System.out.println("Escolha somente \"n\" ou \"s\" ");
				System.out.println("+--------------------------+");
			}
		}else {
			System.out.println("Opção ainda não implementada");
		}
		
		 leitor.close();

	}
}
