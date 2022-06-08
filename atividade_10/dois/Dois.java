import java.util.Scanner;

class Dois{
    public static void main(String args[]){
        Scanner ler= new Scanner(System.in);
        System.out.println("Login: ");
        int login= ler.nextInt();
        System.out.println("Senha: ");
        int senha= ler.nextInt();
        for (int i=3; i>0; i--){
            if(login == 12345 && senha == 12345){
                System.out.println("Acesso realizado");
                System.exit(0);
            }
            else{
                System.out.println("Login e senha incorretos , voce tem " +i+ " tentativas restantes");
                System.out.println("Login: ");
                login= ler.nextInt();
                System.out.println("Senha: ");
                senha= ler.nextInt();
            }
        }
        System.out.println("Acesso negado");
    }
}