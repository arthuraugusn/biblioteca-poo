import java.util.Scanner;

class Treze{
  public static void main(String args[]){
    Scanner ler=new Scanner(System.in);
    System.out.println("Digite a quantidade de numeros primos que voce deseja encontrar");
    int quantidade=ler.nextInt();
    int cont=0;
    int n=0;
    while(cont<quantidade){
      boolean primo=true;
      for(int i=2; i<=(n/2); i++){
        if(n%i==0){
          primo=false;
          break;
        }
      }
      if((primo) && (n>1)){
        System.out.println(n);
        cont++;

        if(cont%10==0){
          System.out.println();
        }
      }
      n++;
    }
  }
}