import java.util.Scanner;

class Calc{
    public static void main (String args[]){
        Scanner ler= new Scanner(System.in);
        int rep= 1;
        while(rep ==1){
            System.out.println("Qual operacao voce quer fazer ?\n1-Soma;\n2-Subtracao\n3-Divisao\n4-Multiplicacao");
            System.out.println();
            int op= ler.nextInt();
            System.out.println();
            System.out.println("Digite um numero");
            double n1= ler.nextDouble();
            System.out.println();
            System.out.println("Digite outro numero");
            double n2= ler.nextDouble();
            if(op ==1){
                double resultadosoma = somar (n1, n2);
                System.out.println("Soma: "+n1 + " + " + n2 + " = " +resultadosoma);
                System.out.println();
            }
            if(op ==2){
                double resultadosubtracao= subtracao (n1, n2);
                System.out.println("Subtracao: "+n1 + " - " + n2 + " = " + resultadosubtracao);
                System.out.println();
            }
            if(op ==3){
                double resultadodivisao= divisao(n1, n2);
                System.out.println("Divisao: "+n1 + " / " + n2 + " = " + resultadodivisao);
                System.out.println();
            }
            if(op==4){
                double resultadomultipli= multiplicacao(n1, n2);
                System.out.println("Multiplicacao: "+n1+ " * " + n2 + " = " + resultadomultipli);
                System.out.println();
            }
            System.out.println("Quer continuar ? \n1-Sim\n2-Nao");
            rep= ler.nextInt();
            System.out.println();
        }
    } 
    public static double somar (double n1, double n2){
        return (n1+n2);
    }
    public static double subtracao (double n1, double n2){
        return (n1-n2);
    }
    public static double divisao (double n1, double n2){
        return (n1/n2);
    }
    public static double multiplicacao (double n1, double n2){
        return (n1*n2);
    }
}