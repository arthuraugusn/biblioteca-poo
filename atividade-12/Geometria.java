import java.util.Scanner;

class Geometria{
    public static void main (String args[]){
        Scanner ler= new Scanner(System.in);
        int rep=1;
        while(rep ==1){
            System.out.println("Qual area voce quer calcular ? \n1-Circulo\n2-Retangulo\n3-Quadrado\n4-Triangulo");
            int op= ler.nextInt();
            if(op==1){
                System.out.println("Digite um valor para o raio");
                double raio= ler.nextDouble();
                double resultcirc= circulo (raio);
                System.out.println(resultcirc);
            }
            if(op==2){
                System.out.println("Digite um valor para a base: ");
                double base= ler.nextDouble();
                System.out.println("Digite um valor para altura: ");
                double altura= ler.nextDouble();
                double resultret= retangulo(base, altura);
                System.out.println(resultret);
            }
            if(op==3){
                System.out.println("Digite um valor para a base: ");
                double base= ler.nextDouble();
                System.out.println("Digite um valor para altura: ");
                double altura= ler.nextDouble();
                double resultquad= quadrado(base, altura);
                System.out.println(resultquad);
            }
            if(op==4){
                System.out.println("Digite um valor para a base: ");
                double base= ler.nextDouble();
                System.out.println("Digite um valor para altura: ");
                double altura= ler.nextDouble();
                double resulttriang= triangulo(base, altura);
                System.out.println(resulttriang);
            }
            System.out.println("Deseja continuar?\n1-Sim\n2-Nao");
            rep= ler.nextInt();
            System.out.println();
        }
    }
    public static double circulo(double raio){
        return (3.14*(raio*raio));
    }
    public static double retangulo (double base, double altura){
        return (base*altura);
    }
    public static double quadrado (double base, double altura){
        return (base*altura);
    }
    public static double triangulo (double base, double altura){
        return (base*altura/2);
    }
}