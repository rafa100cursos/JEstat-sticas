import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("JStattistics!");
               
        // variável : e um espaço reserevado ne memoria do computador 
        // Variável : serve para guardad valores
        // Variável : ela tem um tipo (texto, número, Lógio...)
        /*
         * Ex-1: crie um algoritimo para o JEsstatistics que leia a opção desejada:
         * "Qual o con junto de dados utilizado: 
         * 1- populacional 
         * 2- amostral"
         * O valor recebido deve ser um valor inteiro.
         */
        
        
        /*Scanner leia = new Scanner(System.in);
        int opcao; //declarrei a variável em java.
        System.out.println("/t # /t # /t JStattistics!");
        System.out.println("Qual o conjunto de dados utilizado: 1- populacional 2- amostral");
        opcao = leia.nextInt();
        System.out.println(opcao);
        */
        int opcao; 
        JOptionPane.showMessageDialog(null, "O Jogo da Estatística: JStattistics");
        opcao = Integer.parseInt(JOptionPane.showInputDialog( "Vamso começar o jogo? \n Escolha a estratégia \n 1- Populacional \n 2- Amostraal"));
        JOptionPane.showMessageDialog(null, "você escolheu:"+opcao,"JStattistics", JOptionPane.DEFAULT_OPTION);
        
               

        //System.out.println(opcao);
        String opcaoVariavel = JOptionPane.showInputDialog(null, "Que tipo de variável ele deseja cadastrar:\n 1-Quantitativa \n 2-Qualitativa");
        int opVariavel = Integer.parseInt(opcaoVariavel);
        //JOptionPane.showMessageDialog(null, "Que tipo de variável ele deseja cadastrar:\n 1-Quantitativa \n 2-Qualitativa");
        JOptionPane.showMessageDialog(null, "sua escolha:"+opVariavel,"JStattistics", JOptionPane.DEFAULT_OPTION);

        
    }
}