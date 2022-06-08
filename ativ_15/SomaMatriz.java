import java.util.Scanner;

class SomaMatriz{
    public static void main(String args[]){
        Scanner ler=new Scanner(System.in);
        int matrizA[][]= new int[2][2];
        int matrizB[][]= new int[2][2];
        for(int linha=0; linha<matrizA.length;linha++){
            for(int coluna=0;coluna<matrizA[0].length;coluna++){
                System.out.println("Valores para Matriz A: ");
                matrizA[linha][coluna]=ler.nextInt();
            }
        }
        for(int linha=0; linha<matrizB.length;linha++){
            for(int coluna=0;coluna<matrizB[0].length;coluna++){
                System.out.println("Matriz B agora: ");
                matrizB[linha][coluna]=ler.nextInt();
            }
        }

        int matrizC[][] = somar(matrizA, matrizB);

        for(int linha=0; linha<matrizC.length;linha++){
             for(int coluna=0;coluna<matrizC[0].length;coluna++){
                System.out.println(matrizC[linha][coluna]);
            }
        }

        matrizC= subtrair(matrizA, matrizB);

        System.out.println();
    
        for(int linha=0; linha<matrizC.length;linha++){
            for(int coluna=0;coluna<matrizC[0].length;coluna++){
                System.out.println(matrizC[linha][coluna]);
            }
        }
    }
    public static int[][] somar(int matrizA[][], int matrizB[][]){
        int matrizC[][]=new int[2][2];
        for(int linha=0;linha<matrizC.length;linha++){
            for(int coluna=0;coluna<matrizC[0].length;coluna++){
                matrizC[linha][coluna]=matrizA[linha][coluna]+matrizB[linha][coluna];
            }
        }
        return matrizC;
    }
    public static int[][] subtrair(int matrizA[][], int matrizB[][]){
        int matrizC[][]= new int [2][2];
        for (int linha=0; linha<matrizC.length;linha++){
            for(int coluna=0; coluna<matrizC[0].length; coluna++){
                matrizC[linha][coluna]= matrizA[linha][coluna]- matrizB[linha][coluna];
            }
        }
        return matrizC;
    }
}