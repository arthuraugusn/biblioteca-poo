import java.util.Scanner;
import java.text.DecimalFormat;

public class Matriz{
    public static void main(String args[]){
        Scanner ler=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#.##");
        double matriz[][]= new double[2][2];
        for(int linha=0; linha<matriz.length; linha++){
            for(int colunas=0; colunas<matriz[0].length; colunas++){
                System.out.println("Digite numeros decimais: ");
                matriz[linha][colunas]=ler.nextDouble();
            }
        }
        for(int linha=0; linha<matriz.length; linha++){
            for(int coluna=0; coluna<matriz[0].length; coluna++){
                System.out.println(); 
                System.out.println(matriz[linha][coluna]);
            }
        }
        System.out.println("O menor numero eh: "+df.format(menor(matriz)));
        System.out.println("Sua media eh: "+df.format(media(matriz)));
    }
    public static double menor(double matriz[][]){
        double menorNumero= matriz[0][0];
        for(int linha=0; linha<matriz.length; linha++){
            for(int coluna=0; coluna<matriz[0].length; coluna++){
                if(matriz[linha][coluna]<menorNumero){
                    menorNumero=matriz[linha][coluna];
                }
            }
        }
        return menorNumero;
    }
    public static double media(double matriz[][]){
        double mediaAritmetica=0;
        for(int linha=0; linha<matriz.length; linha++){
            for(int coluna=0; coluna<matriz[0].length; coluna++){
                mediaAritmetica +=matriz[linha][coluna];
            }
        }
        double area = matriz.length * matriz[0].length;
        return mediaAritmetica/area;
    }
}