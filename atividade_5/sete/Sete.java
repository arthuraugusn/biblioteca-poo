import java.util.Scanner;
class Sete{
    public static void main(String args[]){
        Scanner ler= new Scanner (System.in);
        System.out.println("Informe uma medida para metros");
        int metros= ler.nextInt();
        double km= metros/1000;
        double hm= metros/100;
        double dam= metros/10;
        double dm= metros*10;
        double cm= metros*100;
        double mm= metros*1000;
        System.out.println("Metros em quilometros" +km);
        System.out.println("Metros em hectometros" +hm);
        System.out.println("Metros em decametros" +dam);
        System.out.println("Metros em decimetros"+dm);
        System.out.println("Metros em centimetros"+cm);
        System.out.println("Metros em milimetros"+mm);
    }
}