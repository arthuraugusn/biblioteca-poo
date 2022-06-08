import javax.swing.JOptionPane;

class DtGrafi{
    public static void main(String args[]){
        JOptionPane jp= new JOptionPane();
        int val1= Integer.parseInt(jp.showInputDialog(null, "Digite um numero inteiro: "));
        int val2= Integer.parseInt(jp.showInputDialog(null, "Digite outro numero inteiro: "));
        double mod= val1%val2;
        jp.showMessageDialog(null, "Valor da divisao: "+mod);
    }
}