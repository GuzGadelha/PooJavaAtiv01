package questoes;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // 3 - Fazer um programa que recebe os lados de um retângulo, calcula e imprime sua área e seu perímetro.
        Scanner teclado = new Scanner(System.in);
        Retangulo escolhido = new Retangulo();
        System.out.println("Calculadora de retângulo");
        System.out.print("Digite o valor da altura: ");
        escolhido.alt = teclado.nextDouble();
        System.out.print("Digite o valor do comprimento: ");
        escolhido.comp = teclado.nextDouble();
        System.out.println("Perimetro: " + escolhido.Perimetro());
        System.out.println("Área: " + escolhido.Area());

    }
}

class Retangulo{
    double alt, comp;
    public double Perimetro() {
        return alt * 2 + comp * 2;
    }
    public double Area(){
        return alt * comp;
    }
}