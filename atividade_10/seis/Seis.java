class Seis{
    public static void main(String args[]){
        String frase= "Desenvolvimento de Sistemas - Turma DS1-M";
        char op='\u2588';
        System.out.println("");
        for(int i=0; i<57; i++){
            System.out.print(op);
        }
        System.out.println("\n" + op + "\t" + frase + "\t" + op);
        for(int i=0; i<57; i++){
            System.out.print(op);
        }
    }
}