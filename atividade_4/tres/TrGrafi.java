import javax.swing.JOptionPane;

class TrGrafi{
    public static void main(String args[]){
        JOptionPane jp= new JOptionPane();
        int val1= Integer.parseInt(jp.showInputDialog(null, "Digite um numero inteiro: "));
        int val2= Integer.parseInt(jp.showInputDialog(null, "Digite outro numero inteiro: "));
        int s1= val1;
        int s2=  val2;
        jp.showMessageDialog(null, "Valor da variavel1= "+ val1);
        jp.showMessageDialog(null, "Valor da variavel2= "+val2);
        jp.showMessageDialog(null, "Valor da variavel1= "+ s2);
        jp.showMessageDialog(null, "Valor da variavel2= "+s1);
    }
}