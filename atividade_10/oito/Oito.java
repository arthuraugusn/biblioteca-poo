import java.util.Scanner;

class Oito{
    public static void main (String args[]){
        Scanner ler=new Scanner(System.in);
        System.out.println("Quantidade de valores para fibonacci? ");
        System.out.println("");
        long qtde= ler.nextInt();
        if(qtde <2){
            System.out.println("1");
            System.exit(0);
        }
        long n1=1;
        long n2=1;
        for (long i=0; i<qtde-2; i++){
            long n3= n1+n2;
            System.out.println(n3+ ", ");
            n1= n2;
            n2= n3;
        }
    }
}