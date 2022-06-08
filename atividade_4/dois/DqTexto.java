import java.util.Scanner;

class DqTexto{
    public static void main(String args[]){
        Scanner ler= new Scanner (System.in);
        System.out.println("Digite um numero decimal: ");
        double val1= ler.nextDouble();
        System.out.println("Digite outro numero decimal: ");
        double val2= ler.nextDouble();
        double raiz1= Math.sqrt(val1);
        double raiz2= Math.sqrt(val2);
        System.out.println("Valor da raiz 1: "+raiz1);
        System.out.println("Valor da raiz 2: "+raiz2);
    }
}