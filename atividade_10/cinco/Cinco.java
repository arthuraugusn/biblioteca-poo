import java.util.Scanner;

class Cinco{
    public static void main(String args[]){
        Scanner ler=new Scanner (System.in);
        System.out.println("Digite um valor inicial para x: ");
        double x= ler.nextDouble();
        System.out.println("Digite quantas vezes voce quer que o processo repita");
        int usu= ler.nextInt();
        double euler= 1;
        for(int i=usu; i>0; i--){
            euler= Math.pow((1+(1/x)),x);
            System.out.println(euler);
            System.out.println("");
        }
    }
}