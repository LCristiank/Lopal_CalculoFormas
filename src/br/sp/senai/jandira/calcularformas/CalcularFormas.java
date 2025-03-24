package br.sp.senai.jandira.calcularformas;
import br.sp.senai.jandira.calcularformas.ui.Menu;

public class CalcularFormas {

	public static void main(String[] args) {
	//	Menu.criarMenu();
		System.out.println("+-------------------+");
		System.out.println("Tabuada do 9");
		System.out.println("+-------------------+");
		int tabuada = 9;
		int multiplicador = 1;
		int resultado;
		do {
			multiplicador = multiplicador + 1;
			resultado = tabuada * multiplicador;
			System.out.println(tabuada + "x" + multiplicador + "=" + resultado);
		} while(multiplicador < 10);
		
		System.out.println("+-------------------+");
		System.out.println("Números Impares (0 - 100)");
		System.out.println("+-------------------+");
		int contador = 1;
		do {
			if (contador % 2 == 1) {
				System.out.println(contador);
			}
			contador = contador + 1;
		} while(contador < 100);
		

	}
}

