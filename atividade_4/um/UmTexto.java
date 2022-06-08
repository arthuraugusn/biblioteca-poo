import java.util.Scanner;

class UmTexto{
    public static void main(String args[]){
        Scanner ler= new Scanner(System.in);
        System.out.println("Diga um numero decimal: ");
        double val1= ler.nextDouble();
        System.out.println("Diga um segundo numero decimal");
        double val2= ler.nextDouble();
        double valso= val1+val2;
        double valsu= val1-val2;
        double valmul= val1*val2;
        double valdiv= val1/val2;
        System.out.println("Resultado soma: "+valso);
        System.out.println("Resultado subtracao: "+valsu);
        System.out.println("Resultado multiplicacao: "+valmul);
        System.out.println("Resultado divisao: "+valdiv);
    }
}