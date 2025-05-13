import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        JOptionPane.showMessageDialog(null,  "Alô jardim");

           
           String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
           
           String endereco = JOptionPane.showInputDialog("Digite o endereço do cliente:");
           
           
           String mensagem = "Cliente cadastrado:\nNome: " + nome + "\nEndereço: " + endereco;
           JOptionPane.showMessageDialog(null, mensagem);

           
        String larguraStr = JOptionPane.showInputDialog("Digite a largura do jardim (em metros):");
        
        String comprimentoStr = JOptionPane.showInputDialog("Digite o comprimento do jardim (em metros):");
        
        try {
            // Converte as entradas para números
            double largura = Double.parseDouble(larguraStr);
            double comprimento = Double.parseDouble(comprimentoStr);
            
            
            double area = largura * comprimento;
            
            
            JOptionPane.showMessageDialog(null, "A área do jardim é: " + area + " metros quadrados.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos.");
        }

        String input = JOptionPane.showInputDialog("Digite o tamanho do jardim em metros quadrados:");
        try {
            double tamanho = Double.parseDouble(input);
            String classificacao;

            // Usando switch/case para classificar
            int categoria = (tamanho >= 100) ? 1 : 2;

            switch (categoria) {
                case 1:
                    classificacao = "Grande";
                    break;
                case 2:
                    classificacao = "Pequeno";
                    break;
                default:
                    classificacao = "Desconhecido";
            }

            JOptionPane.showMessageDialog(null, "O jardim é " + classificacao + ".");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
        }

                          

       }
 
}
