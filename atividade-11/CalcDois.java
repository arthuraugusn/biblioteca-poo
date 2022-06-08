import java.util.Scanner;

class CalcDois{
    public static void main(String args[]){
        Scanner ler= new Scanner(System.in);
        String printado= exibir(print);
        System.out.println(printado);
    }
    public static String exibir(String print){
        Scanner ler= new Scanner(System.in);
        System.out.println("Qual operacao voce deseja?\n1-Soma\n2-Subtracao\n3-Divisao\n4-Multiplicacao");
        int op=ler.nextInt();
        System.out.println("Digite um numero");
        double n1=ler.nextDouble();
        System.out.println("Digite outro numero");
        double n2=ler.nextDouble();
    }
    public static double somar(double n1, double n2){
        return (n1+n2);
    }
    public static double subtracao(double n1, double n2){
        return (n1-n2);
    }
    public static double divisao (double n1, double n2){
        return (n1/n2);
    }
    public static double multiplicacao (double n1, double n2){
        return (n1*n2);
    }
}