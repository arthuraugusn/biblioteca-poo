import java.util.ArrayList;
import java.util.Scanner;

public class Primo {
    public static void main(String args[]){
        Scanner ler=new Scanner(System.in);
        System.out.println("Digite os numeros que voce deseja");
        int numeros=ler.nextInt();
        ArrayList<Integer> lista= new ArrayList<Integer>();
        for(int i=2; i<=(numeros/2); i++){
            if(numeros %2==0){
                lista.add(i);
                System.out.println(i);
            }
        }
        if(lista.size()==0){
            System.out.println("");
        }
    }
}