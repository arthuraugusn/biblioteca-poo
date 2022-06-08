public class Estatistica{
    public static void main(String args[]){
        System.out.println(media(numeros));
        System.out.println(menor(numeros));
        System.out.println(maior(numeros));
    }
    public static double media(double vetor[]){
        double total=0;
        for(int i=0; i<vetor.length; i++){
            total+=vetor[i];
        }
        return total/vetor.length;
    }
    public static double menor(double vetor[]){
        double menorNumero=0;
        for(int i=1; i<vetor.length; i++){
            if(menorNumero<vetor[i]){
                menorNumero= vetor[i];
            }
        }   
        return menorNumero;
    }
    public static double maior(double vetor[]){
        double maiorNumero=0;
        for(int i=1; i<vetor.length; i++){
            if(maiorNumero>vetor[i]){
                maiorNumero= vetor[i];
            }
        }
        return maiorNumero;
    }
}