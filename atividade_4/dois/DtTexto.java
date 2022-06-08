import java.util.Scanner;

class DtTexto{
    public static void main(String args[]){
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite um numero inteiro: ");
        int val1= ler.nextInt();
        System.out.println("Digite outro numero inteiro: ");
        int val2= ler.nextInt();
        double mod= val1%val2;
        System.out.println("Valor da divisao= "+mod);
    }
}