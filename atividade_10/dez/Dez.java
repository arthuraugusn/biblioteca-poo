import java.util.Scanner;

class Dez{
    public static void main(String args[]){
        Scanner ler= new Scanner(System.in);
        System.out.println("Informe seu numero: ");
        int n= ler.nextInt();
        for (int i=2; i<n/2+1; i++){
            if (n % i ==0){
                System.out.println(n + ": Nao eh primo ");
                System.exit(0);
            }
        }
        System.out.println(n+ ": Eh primo");
    }
}