import java.util.Scanner;

class TrTexto{
    public static void main(String args[]){
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite um numero inteiro: ");
        int val1= ler.nextInt();
        System.out.println("Digite outro numero inteiro: ");
        int val2= ler.nextInt();
        int s1= val1;
        int s2= val2;
        System.out.println("Variável 1:"+val1);
		System.out.println("Variavel 2:"+val2);
		System.out.println("Variavel 1:"+s2);
		System.out.println("Variavel 2:"+s1);
    }
}