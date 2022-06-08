import java.util.Scanner;

class Cincot{
    public static void main(final String args[]){
        Scanner ler = new Scanner (System.in);
        System.out.println("Preço do dolar: ");
        final double valdolar= ler.nextDouble();
        System.out.println("Quantidade para conversao: ");
        final double quanti= ler.nextDouble();
        final double valreal= valdolar*quanti;
        System.out.println("Valor em real: ");
    }
}