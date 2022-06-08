import javax.swing.JOptionPane;

class Ddgrafi{
    public static void main(String args[]){
        JOptionPane jp= new JOptionPane();
        int val1= Integer.parseInt(jp.showInputDialog(null, "Digite um numero inteiro: "));
        int val2= Integer.parseInt(jp.showInputDialog(null, "Digite outro numero inteiro: "));
        double div= val1/val2;
        jp.showMessageDialog(null, "Valor da divisao: "+div);
    }
}