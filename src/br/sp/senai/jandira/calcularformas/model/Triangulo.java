package br.sp.senai.jandira.calcularformas.model;

public class Triangulo {
	private double altura;
	private double base;
	
	public void setAltura(double altura){
		if (altura > 0) {
			this.altura = altura;
		} else {
			System.out.println("Valor deve ser maior que 0");
		}
	}
	public void setBase(double base) {
		if (base > 0) {
			this.base = base;
		}  else {
			System.out.println("Valor deve ser maior que 0");
		}
	}
	public double getAltura() {
		return altura;
	}
	public double getBase() {
		return base;
	}
	public double calcularArea() {
		double resultArea = base * altura / 2;
		return resultArea;
	}
	public void mostrarDados() {
		double area = calcularArea();
		
		System.out.println("==========================");
		System.out.printf("Forma Geometrica: Triângulo \n");
		System.out.printf("Base: %s \n", base);
		System.out.printf("Altura: %s \n", altura);
		System.out.printf("Area: %s \n", area);
	}
}
