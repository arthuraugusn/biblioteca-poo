import java.util.Scanner;

class Calculadora{
    public static void main(String args[]){

        double n1=entrada("Digite o primeiro numero: ");
        double n2=entrada("Digite o segundo numero: ");

        double somar= soma(n1,n2);
        double diferenca= subtracao(n1, n2);
        double multiplicar= multiplicacao(n1, n2);
        double diviresult= divisao(n1, n2);

        exibir(n1, '+', n2, somar);
        exibir(n1, '-', n2, diferenca);
        
    }

    public static double entrada(String frase){
        Scanner ler= new Scanner(System.in);
        System.out.println(frase);
        double numero= ler.nextDouble();
        return numero;
    }

    public static void exibir(double n1, char op, double n2, double res){
        System.out.println(n1 + " "+ op + " " + n2 + " = "+ res);
    }
    public static double soma(double n1, double n2){
        return (n1+n2);
    }
    public static double subtracao(double n1, double n2){
        return (n1-n2);
    }
    public static double divisao(double n1, double n2){
        return (n1/n2);
    }
    public static double multiplicacao(double n1, double n2){
        return (n1*n2);
    }
}