import javax.swing.JOptionPane;

class Seisg{
    public static void main(String args[]){
        JOptionPane jp= new JOptionPane();
        double grausc= Double.parseDouble(jp.showInputDialog(null, "Digite um valor para graus celsius: "));
        double grausf= (9*grausc+160)/5;
        jp.showMessageDialog(null, "A conversao de graus celsius em graus fahrenheit seria: "+grausf);
    }
}