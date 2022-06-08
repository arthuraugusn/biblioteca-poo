import javax.swing.JOptionPane;

class Quatrog{
    public static void main(String args[]){
        JOptionPane jp= new JOptionPane();
        double crompraini= Double.parseDouble(jp.showInputDialog(null, "Digite o valor inicial da compra: "));
        double desconto= Double.parseDouble(jp.showInputDialog(null, "Digite o valor de desconto: "));
        double compraa= crompraini*desconto/100;
        double comprafinal= crompraini-compraa;
        jp.showMessageDialog(null, "Valor da compra final= "+ comprafinal);
    }
}