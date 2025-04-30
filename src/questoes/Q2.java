package questoes;

public class Q2 {
    public static void main(String[] args) {
        Numericos num = new Numericos();
        num.nota1 = Float.parseFloat(args[0]);
        num.nota2 = Float.parseFloat(args[1]);
        num.nota3 = Float.parseFloat(args[2]);
        System.out.println("A média é: " + num.Media());
    }
}

class Numericos {
    float nota1, nota2, nota3;

    public float Media() {
        return (nota1 + nota2 + nota3) / 3.0f;
    }
}