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

        // Entrada do tamanho do jardim
        String inputTamanho = JOptionPane.showInputDialog("Digite o tamanho do jardim em metros quadrados:");
        try {
            double tamanho = Double.parseDouble(inputTamanho);
            String classificacao;

            // Classificação do jardim
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

            // Entrada do número de serviços realizados pelo cliente
            String inputServicos = JOptionPane.showInputDialog("Quantos serviços você já realizou conosco?");
            int quantidadeServicos = Integer.parseInt(inputServicos);

            // Definir o desconto com base na quantidade de serviços
            double desconto = 0.0;
            if (quantidadeServicos >= 10) {
                desconto = 0.20; // 20% de desconto para clientes fiéis
            } else if (quantidadeServicos >= 5) {
                desconto = 0.10; // 10% de desconto
            } else {
                desconto = 0.0; // Sem desconto
            }

            // Exibir a classificação do jardim
            JOptionPane.showMessageDialog(null, "O jardim é " + classificacao + ".");

            // Opcional: mostrar o desconto aplicado
            if (desconto > 0) {
                JOptionPane.showMessageDialog(null, "Você recebeu um desconto de " + (int)(desconto * 100) + "% por sua fidelidade!");
            } else {
                JOptionPane.showMessageDialog(null, "Sem desconto de fidelidade no momento.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
        }

                          

       }
 
}
