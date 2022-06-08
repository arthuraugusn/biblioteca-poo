import javax.swing.JOptionPane;

class Dugrafi{
    public static void main(String args[]){
        JOptionPane jp= new JOptionPane();
        double val1= Double.parseDouble(jp.showInputDialog(null, "Digite um numero decimal: "));
        double val2= Double.parseDouble(jp.showInputDialog(null, "Digite outro numero decimal: "));
        double pot1= Math.pow(val1, 5);
        double pot2= Math.pow(val2, 5);
        jp.showMessageDialog(null, "Valor da potencia 1: "+ pot1);
        jp.showMessageDialog(null, "Valor da potencia 2: "+pot2);
    }
}