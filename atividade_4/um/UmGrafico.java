import javax.swing.JOptionPane;
class UmGrafico{
    public static void main(String args[]){
        JOptionPane jp= new JOptionPane();
        double val1= Double.parseDouble(jp.showInputDialog(null, "Um numero decimal: "));
        double val2= Double.parseDouble(jp.showInputDialog(null, "Outro numero decimal: "));
        double valorso= val1+val2;
        double valorsu= val1-val2;
        double valormul= val1*val2;
        double valordiv= val1/val2;
        jp.showMessageDialog(null, "Valor da soma: " +valorso);
        jp.showMessageDialog(null, "Valor da subtracao: " +valorsu);
        jp.showMessageDialog(null, "Valor da multiplicacao: " +valormul);
        jp.showMessageDialog(null, "Valor da divisao: " +valordiv);
    }
}