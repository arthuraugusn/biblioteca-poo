import java.util.Scanner;

class Quatro{
    public static void main(String args[]){
        Scanner ler= new Scanner(System.in);
        System.out.println("Digite um valor inicial para x: ");
        double x= ler.nextDouble();
        double euler= Math.pow((1+(1/x)),x);
        System.out.println(euler);
    }
}