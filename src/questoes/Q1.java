package questoes;

public class Q1 {
    public static void main(String[] args) {
        Floats num = new Floats();
        num.nota1 = Float.parseFloat(args[0]);
        num.nota2 = Float.parseFloat(args[1]);
        num.nota3 = Float.parseFloat(args[2]);
        System.out.println("A média é: " + (num.nota1 + num.nota2 + num.nota3)/3.0f);
    }
}

class Floats {
    float nota1, nota2, nota3;

}

