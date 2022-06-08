import java.util.Scanner;

class Seist{
    public static void main(String args[]){
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite um valor em Graus Celsius: ");
        double celsius= ler.nextDouble();
        double grausf= (9*celsius+160)/5;
        System.out.println("A conversao de graus celsius em graus fahrenheit seria: "+grausf);
    }
}