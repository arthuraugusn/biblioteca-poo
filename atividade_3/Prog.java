import javax.swing.JOptionPane;

class Prog{
    public static void main(String args[]){
        JOptionPane jp=  new JOptionPane();

        int anoNascimento= Integer.parseInt(jp.showInputDialog(null, "Ano que voce nasceu: "));
        int anoAgora= Integer.parseInt(jp.showInputDialog(null, "Ano que voce esta: "));
        int idade= anoAgora - anoNascimento;
        jp.showMessageDialog(null, "Sua idade: "+idade+ " anos.");
    }
}