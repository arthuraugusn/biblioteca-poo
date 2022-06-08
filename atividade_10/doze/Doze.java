import java.util.Scanner;

class Doze{
    public static void main(String args[]){
        Scanner ler= new Scanner(System.in);
        System.out.println("Informe seu numero: ");
        int numero= ler.nextInt();
        for (int i=2; i<numero/2+1; i++){
            if (numero % i ==0){
                System.out.println(numero + ": Nao eh primo ");
              System.out.println();
              for(int j=2; j<numero; j++){
                if(numero % j==0){
                  System.out.println(j+" eh divisivel por "+numero);
                }
              }
              System.exit(0);
        }
        System.out.println(numero+ ": Eh primo");
    }
  }
}