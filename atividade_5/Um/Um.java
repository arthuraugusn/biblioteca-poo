import java.util.Scanner;
class Um{
    public static void main (String args []){
        Scanner ler= new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int n1= ler.nextInt();
        if (n1==0){
            System.out.println("Zero");
        }
        else{
            if  (n1>=0){
                System.out.println("Positivo");
            }
            else{
                System.out.println("Negativo");
            }
        }
    }
}
       