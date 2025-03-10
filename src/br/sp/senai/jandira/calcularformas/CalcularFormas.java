package br.sp.senai.jandira.calcularformas;

import br.sp.senai.jandira.calcularformas.model.Circuferencia;
import br.sp.senai.jandira.calcularformas.model.Quadrado;
import br.sp.senai.jandira.calcularformas.model.Retangulo;
import br.sp.senai.jandira.calcularformas.model.Trapezio;
import br.sp.senai.jandira.calcularformas.model.Triangulo;

public class CalcularFormas {

	public static void main(String[] args) {
		Retangulo formaR = new Retangulo();
		Triangulo formaT = new Triangulo();
		Trapezio formaTR = new Trapezio();
		Quadrado formaQD = new Quadrado();
		Circuferencia formaC = new Circuferencia();
		
		formaR.setAltura(13);
		formaR.setBase(14);
		formaR.mostrarDados();
		
		formaT.setAltura(13);
		formaT.setBase(14);
		formaT.mostrarDados();
		
		formaTR.setAltura(13);
		formaTR.setBaseMaior(14);
		formaTR.setBaseMenor(1);
		formaTR.mostrarDados();
		
		formaQD.setLado(13);
		formaQD.mostrarDados();
		
		formaC.setRaio(133);
		formaC.mostrarDados();
		
		
	}

}
