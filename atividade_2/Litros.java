class Litros{
    public static void main(String args[]){
        double tempo= 6;
        double velocidade= 80;
        double distancia=velocidade*tempo;
        double litrosu= distancia/12;
        System.out.println("Velocidade média= "+velocidade);
        System.out.println("Tempo gasto= "+tempo);
        System.out.println("Distância percorrida= "+distancia);
        System.out.println("Litros gastos na viagem="+litrosu);
    }
}