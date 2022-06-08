import java.util.Scanner;

class Um{
    public static void main(String args[]){
        Scanner ler= new Scanner (System.in);
        char op= 's';
        while(op =='s'){
            while(true){
                System.out.println("Digite um numero");
                int n= ler.nextInt();
                if(n % 2 ==0){
                    System.out.println("Seu numero e par");
                }
                else{
                    System.out.println("Seu numero e impar");
                }
                break;
            }
            System.out.println("\nDeseja continuar [s/n]");
            op = ler.next().charAt(0);
            if (op!= 's'){
                System.exit(0);
            }
        }
    }
}