import java.util.Scanner;

class Tres{
    public static void main(String args[]){
        Scanner ler= new Scanner (System.in);
        System.out.println("Digite um numero inteiro positivo para a base: ");
        long base= ler.nextInt();
        System.out.println("Digite um numero inteiro positivo para o expoente");
        long expoente= ler.nextInt();
        long resultado= 1;
        for(long i= expoente; i!=0; i--){
            resultado= resultado*base;
        }
        System.out.println(resultado);
    }
}   