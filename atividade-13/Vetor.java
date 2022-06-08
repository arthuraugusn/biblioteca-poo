import java.util.Scanner;

class Vetor{
    public static void main(String args[]){
        double entrada[]= inicio();
        System.out.println(entrada);
        retornamm(entrada);
    }
    public static double[] inicio(){
        Scanner ler= new Scanner(System.in);
        double decimais[]= new double[3];
        for(int i=0; i<decimais.length; i++){
            System.out.println((i+1)+"ª Numero decimal: ");
            decimais[i]= ler.nextDouble();
        }
        return decimais;
    }
    public static double[] retornamm(double entrada[]){
         
    }
}