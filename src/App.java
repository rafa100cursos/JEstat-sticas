import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        JOptionPane.showMessageDialog(null,  "Alô jardim");

           
           String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
           
           String endereco = JOptionPane.showInputDialog("Digite o endereço do cliente:");
           
           
           String mensagem = "Cliente cadastrado:\nNome: " + nome + "\nEndereço: " + endereco;
           JOptionPane.showMessageDialog(null, mensagem);
       }
       

    
}
