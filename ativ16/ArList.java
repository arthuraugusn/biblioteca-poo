import java.util.ArrayList;

class ArList{
    public static void main(String args[]){
        ArrayList<Integer> idade= new ArrayList<Integer>();
        ArrayList<String> cidade= new ArrayList<String>();

        idade.add(25);
        idade.add(40);

        cidade.add("Bogota");
        cidade.add("Tegucigalpa");

        System.out.println(idade);
        System.out.println(cidade);
    }
}