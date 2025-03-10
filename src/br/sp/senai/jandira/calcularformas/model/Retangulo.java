package br.sp.senai.jandira.calcularformas.model;

public class Retangulo {
	public double base;
	public double altura;
	
	public void setBase(double base) {
		if (base > 0) {
			this.base = base;
		} else {
			System.out.println("Informe um Valor Válido");
		}
	}
	public void setAltura(double altura ) {
		if (altura > 0) {
			this.altura = altura;
		} else {
			System.out.println("Informe um Valor Válido");
		}
	}
	
	public double getBase() {
		return base;
	}
	public double getAltura() {
		return altura;
	}
	
	public double calcularArea() {
		double resultadoArea = base * altura;
		return resultadoArea;
	}
	
	public double calcularPerimetro() {
		double resultadoPerimetro = (base * 2) + (altura * 2);
		return resultadoPerimetro;
	}
	
	public void mostrarDados() {
		double area = calcularArea();
		double perimetro = calcularPerimetro();
		
		System.out.println("==========================");
		System.out.printf("Forma Geometrica: Retangulo \n");
		System.out.printf("Base: %s \n", base);
		System.out.printf("Altura: %s \n", altura);
		System.out.printf("Area: %s \n", area);
		System.out.printf("Perimetro: %s \n", perimetro);
	}
}
