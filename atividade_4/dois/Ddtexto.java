import java.util.Scanner;

class Ddtexto{
    public static void main(String args[]){
        Scanner ler= new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int val1= ler.nextInt();
        System.out.println("Digite outro numero inteiro: ");
        int val2= ler.nextInt();
        double div= val1/val2;
        System.out.println("Valor da divisao= "+div);
    }
}  