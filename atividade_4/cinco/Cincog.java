import javax.swing.JOptionPane;

class Cincog{
    public static void main(final String args[]){
        JOptionPane jp= new JOptionPane();
        final double valdolar= Double.parseDouble(jp.showInputDialog(null, "Digite o valor do dolar: "));
        final double quantidade= Double.parseDouble(jp.showInputDialog(null, "Quantidade para conversao: "));
        final double valreal= valdolar*quantidade;
        jp.showMessageDialog(null, "Valor em real "+ valreal);
    }
}