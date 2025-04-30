import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        
        //if
        //if else
        //switch
        //ternário
        /*
         * Exemplo: outro forma usando {} fazendo sem as {}
         * {}
         * int x = 10;
        if(x>=10){
        JOptionPane.showMessageDialog(null,"É maior ou igual a 10");
        }
         * sem as {}
         * int x = 10;
        if(x>=10)
        JOptionPane.showMessageDialog(null,"É maior ou igual a 10");
         * 
         */
        // primeiro Exemplo aula 
        /*
         * int op = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o resultado de uma população? 1-Parãmetro 2-Estatística"));

        if(op == 1){        
            JOptionPane.showMessageDialog(null,"Certa Resposta");
        }
        
        else{
            JOptionPane.showMessageDialog(null,"Resposta Errada!");

        }
         */

         //if
        //Exercícios (para cada pergunta crie um if)
        /*
         * Considerando os números 30,50,80,90 Digite o valor da média aritimédia simples?
         * gabarito: 62,5
         * Considerando os valores 10,40,50,80,10. Digite qual é a moda?
         * 10
         * Qual a medida de tendência central que mostra o centro da amostra?
         * 
         */

         /*

        int op = Integer.parseInt(JOptionPane.showInputDialog(null,"Considerando os números 30,50,80,90 Digite o valor da média aritimédia simples? \n 1- 62,5 \n 2- 50 \n 3- 80"));

        if(op == 1){        
            JOptionPane.showMessageDialog(null,"Certa Resposta");
        }        
        else{
            JOptionPane.showMessageDialog(null,"Resposta Errada!", "JStatistics",JOptionPane.ERROR_MESSAGE);
        }
        

        int op1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Considerando os valores 10,40,50,80,10. Digite qual é a moda? \n 1- 40 \n 2- 10 \n 3- 50 \n 4- 80"));

        if(op1 == 2){        
            JOptionPane.showMessageDialog(null,"Certa Resposta");
        }        
        else{
            JOptionPane.showMessageDialog(null,"Resposta Errada!", "JStatistics",JOptionPane.ERROR_MESSAGE);
        }


        int op2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a medida de tendência central que mostra o centro da amostra? \n 1- Moda \n 2- Média \n 3- Mediana"));

        if(op2 == 2){        
            JOptionPane.showMessageDialog(null,"Certa Resposta");
        }        
        else{
            JOptionPane.showMessageDialog(null,"Resposta Errada!", "JStatistics",JOptionPane.ERROR_MESSAGE);
        }
        
        */

        double media =Double.parseDouble(JOptionPane.showInputDialog("Considerando os valores 10,40,50,80,10. Digite qual é a moda?"));
         if(media == 65.5){        
            JOptionPane.showMessageDialog(null,"Certa Resposta");
        }        
        else{
            JOptionPane.showMessageDialog(null,"Resposta Errada!", "JStatistics",JOptionPane.ERROR_MESSAGE);
        }
         
        Int Ex2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Considerando os valores 10,40,50,80,10. Digite qual é a moda? \n 1- 40 \n 2- 10 \n 3- 50 \n 4- 80"));

        String  media = JOptionPane.showInputDialog("args");
    }

}
