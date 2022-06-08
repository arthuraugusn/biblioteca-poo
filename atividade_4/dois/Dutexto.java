import java.util.Scanner;

class Dutexto{
    public static void main(String args[]){
        Scanner ler = new Scanner (System.in);
        System.out.println("Diga um número decimal: ");
        double val1= ler.nextDouble();
        System.out.println("Diga outro número decimal: ");
        double val2= ler.nextDouble();
        double pot1= Math.pow(val1, 5);
        double pot2= Math.pow(val2, 5);
        System.out.println("Valor da potencia um seria: "+pot1);
        System.out.println("Valor da potencia dois seria: "+pot2);
    }
}