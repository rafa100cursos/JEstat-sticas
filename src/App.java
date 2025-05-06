import java.util.Random;

import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        // Cara ou Coroa - probabilidade
        //50% cara
        //50% coroa
        //Espaço amostral- quando voçê consegue mensurar o resultado.
        //Variável que receba a interação do jogo
        //Random
        //Switch
        //Fo, do while while
        //Vetor, Matriz unidimensional ou Arrays

        String[] espacoAmostral = {"Cara","Coroa"};

        //Objeto Random
        //Random random = new Random(); - sever para criar sorteio
        Random random = new Random();
        //Contadores para verificar a distribuição
        int contaCara = 0;
        int contaCoroa =0;
        String mensagem="Espaço amostral:{Cara, Coroa}\n"+"Probabilidade de Cara: 50%\n"+"Probabilidade de Coroa: 50%\n"+"Deseja lançar a moda?";
        //loop de lançamento
        while (true) {
            //interação com usuário
            int opcao = JOptionPane.showConfirmDialog(null, random, mensagem, "Lançando moedas",JOptionPane.YES_NO_OPTION);
            if(opcao != JOptionPane.YES_OPTION){

                //estaísticas
                String estatisticas = "jogo finalizado!\n"+
                "Total de lançamentos:"+(contCara+contCoroa)+"\n"+
                "Cara:"+contCara+"Coroa:"+contCoroa;JOptionPane.showMessageDialog(null, mensagem, estatisticas, "Finalizando o jogo", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            int resultado = random.nextInt(2);//0-cara 1-coroa
            if(resultado == 0){
                contCara++;
            }else{
                contaCoroa++;
            }
            String saida = "Resultado do lançamento:"+espacoAmostral[resultado]+"\n(indice gerado:"resultado+")";
            JOptionPane.showMessageDialog(null, mensagem, saida, "Resultado",JOptionPane.in);
        } 

    }
}
