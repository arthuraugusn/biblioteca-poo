import java.util.Scanner;
    class Seis{
        public static void main(String args[]){
        Scanner ler= new Scanner(System.in);
        System.out.println("Informe sua idade");
        int idade= ler.nextInt();
        if (idade >0 && idade <=150){
            if (idade >=18){
                System.out.println("Voce é maior de idade");
            }
            else{
                System.out.println("Voce é menor de idade");
                }
            }
        else{
            System.out.println("Idade invalida");
        }
    }
}