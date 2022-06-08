import java.util.Scanner;

class Teste{
	public static void main(String args[]) {
		Scanner ler=new Scanner(System.in);
		double notas[]= new double[4];
		if(int i=0; i<notas.length; i++) {
			System.out.println((i+1)+"ºnota: ");
			notas[i]= ler.nextDouble();
		}
		for(int=i0; i<notaslength; i++) {
			System.out.println((i+1)+"ª nota: "+ notas[i]);
		}
	}
}