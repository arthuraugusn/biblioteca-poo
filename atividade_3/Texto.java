import java.util.Scanner;
class Texto{
    public static void main(String args[]){
        Scanner ler= new Scanner(System.in);
        System.out.print("\nQual seu ano de nascimento? ");
        int anoNasci= ler.nextInt();
        System.out.print("\nQual ano estamos?");
        int anoAgor= ler.nextInt();
        int idade= anoAgor - anoNasci;
        System.out.print("\nSua idade seria: "+idade + "anos");
    }
}