import java.util.Scanner;
class Cinco{
    public static void main(String args[]){
        Scanner ler= new Scanner(System.in);
        System.out.println("Informe sua idade");
        int n1= ler.nextInt();
        if(n1>=18){
            System.out.println("Maior de idade");
        }
        else{
            System.out.println("Menor de idade");
        }
    }
}