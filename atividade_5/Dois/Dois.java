import java.util.Scanner;
class Dois{
    public static void main(String args[]){
        Scanner ler= new Scanner (System.in);
        System.out.println("Digite um numero qualquer");
        double n1= ler.nextDouble();
        if(n1==10){
            System.out.println("Dez");
        }
        else{
            if(n1>=10){
                System.out.println("Maior que dez");
            }
            else{
                System.out.println("Menor que dez");
            }
        }
    }
}