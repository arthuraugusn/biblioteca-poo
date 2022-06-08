import java.util.Scanner;

class Excecao{
    public static void main(String args[]){
        Scanner ler= new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        try{
            int num=ler.nextInt();
            System.out.println("\nVoce digitou" +num);
        }
        catch(Exception e){
            System.out.println("Ops, digitou errado nazi");
        }
    }
}