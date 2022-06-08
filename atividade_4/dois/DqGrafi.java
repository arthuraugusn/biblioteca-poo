import javax.swing.JOptionPane;

class DqGrafi{
    public static void main(String args[]){
        JOptionPane jp= new JOptionPane();
        double val1= Double.parseDouble(jp.showInputDialog(null, "Digite um numero decimal: "));
        double val2= Double.parseDouble(jp.showInputDialog(null, "Digite outro numero decimal: "));
        double raiz1= Math.sqrt(val1);
        double raiz2= Math.sqrt(val2);
        jp.showMessageDialog(null, "Valor da raiz 1: "+ raiz1);
        jp.showMessageDialog(null, "Valor da raiz 2: "+raiz2);
    }
}