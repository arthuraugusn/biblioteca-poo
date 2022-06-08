import javax.swing.JOptionPane;

class Teste2{
    public static void main(String args[]){
        JOptionPane jp= new JOptionPane ();

        String nome= jp.showInputDialog(null, "Fala teu nome");
        jp.showMessageDialog(null, "Bem Vinde Gay!" +nome);
    }
}