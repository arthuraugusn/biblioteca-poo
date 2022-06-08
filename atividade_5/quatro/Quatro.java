import java.util.Scanner;
class Quatro{
    public static void main(String args[]){
        Scanner ler= new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int n1= ler.nextInt();
        if(n1%2==0){
            System.out.println("Par");
        }
        else{
            System.out.println("Impar");
        }
    }
}