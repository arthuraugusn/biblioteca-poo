import java.util.Scanner;
class Tres{
    public static void main(String args[]){
        Scanner ler= new Scanner(System.in);
        System.out.println("Digite um numero");
        double n1= ler.nextDouble();
        System.out.println("Digite outro numero");
        double n2= ler.nextDouble();
        if(n1==n2){
            System.out.println("Os dois numeros sao iguais");
        }
        else{
            if(n1>n2){
                System.out.println("O primeiro é o maior");
            }
            else{
                System.out.println("O segundo é o maior");
            }
        }
    }
}