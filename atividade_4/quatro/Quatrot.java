import java.util.Scanner;

class Quatrot{
    public static void main(String args[]){
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite o valor da compra inicial: ");
        int comprai= ler.nextInt();
        System.out.println("Digite o valor do desconto: ");
        int desconto= ler.nextInt();
        int compraa= comprai*desconto/100;
        int compraf= comprai-compraa;
        System.out.println("Valor da compra com desconto= "+compraf);
    }
}