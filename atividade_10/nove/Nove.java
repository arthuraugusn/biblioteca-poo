import java.util.Scanner;
import java.text.DecimalFormat;

class Nove{
    public static void main(String argd[]){
        Scanner ler=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.###");
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
            System.out.println("**" + df.format((double)n2/n1) + " ");
            n1= n2;
            n2= n3;
        }
    }
}