package questoes;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] srgs){
        Scanner cin = new Scanner(System.in);
        Valores escolhido = new Valores();
        System.out.println("Qual o maior?");
        System.out.print("Digite o primeiro número: ");
        escolhido.n1 = cin.nextDouble();
        System.out.print("Digite o segundo numero: ");
        escolhido.n2 = cin.nextDouble();
        System.out.println("Resposta: " + escolhido.Maior());
    }
}

class Valores {
    double n1;
    double n2;
    public double Maior(){
        return Math.max(n1, n2);
        // Poderia ser usado o operador ternario tambem, sendo "(n1>n2)?n1:n2"
    }
}