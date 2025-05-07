
import javax.swing.JOptionPane;
import java.util.Random;

public class JogoDeDados {
    public static void main(String[] args) {
        Random random = new Random();
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            // Mensagem de boas-vindas
            JOptionPane.showMessageDialog(null, "Bem-vindo ao jogo de dados!");

            // Espera o usuário clicar em OK para rolar o dado
            JOptionPane.showMessageDialog(null, "Pressione OK para rolar o dado...");

            // Gera o resultado do dado
            int resultado = random.nextInt(6) + 1;

            // Mostra o resultado
            JOptionPane.showMessageDialog(null, "Você rolou: " + resultado);

            // Pergunta se quer jogar novamente
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Jogo de Dados", JOptionPane.YES_NO_OPTION);

            if (resposta != JOptionPane.YES_OPTION) {
                jogarNovamente = false;
                JOptionPane.showMessageDialog(null, "Obrigado por jogar! Até a próxima.");
            }
        }
    }
}