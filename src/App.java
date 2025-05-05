import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula3- Switch e Lopops");
        //Switch é uma estrutura de seleção múltipla
        //Um if mais organizado
        //Escolha
            //Caso
        //Para resolver listas ou constantes.
            //Menu
                //opcao1
                //opcao2

        int op = Integer.parseInt(JOptionPane.showInputDialog("Digete a opção: \n1-Estrtatís Descritiva \n2-Probabilidade \n3-Modelos probabilísticos \n4-Sair"));
        if(op == 4){
         // != diferente siguinifica sinal e diferente   
         
            switch(op){
                case 1:JOptionPane.showMessageDialog(null, "Estrtatís Descritiva");break;
                case 2:JOptionPane.showMessageDialog(null, "Probabilidade");break;
                case 3:JOptionPane.showMessageDialog(null, "Modelos probabilísticos");break;
                default:JOptionPane.showMessageDialog(null,"Opção Inválida");
            }

        }else{
            JOptionPane.showMessageDialog(null, "Encerrando sistema...");

        }
        /*Como funciona os loops */
        //while = teste no inicio
        //for = wile compacto
        //do whilw = teste final
        /*
         * inicio = 1
         * condição <=5 quando for menos 5 
         * incremento/decremento i=i+1
         * 
         * Ex:de repetição int contador = 1;
         while (contador<=3) {
            JOptionPane.showMessageDialog(null, "Viva senai");
            contador = contador+1;
         }
         */

         int contador = 1;
         while (contador<=3) {
            JOptionPane.showMessageDialog(null, "Viva senai");
            contador = contador+1;
         }

         int i = 1;
         while (i<=10) {
            System.out.println(i);
            i++;            
         }

         for(int cont=1;cont<=10;cont++) {
            //System.out.println(cont)  ;
         }
         
        String sair;
            do{
                //System.out.println("Sair:s ou não");
                sair = JOptionPane.showInputDialog("Digite s- sim ou n- não");
            
            }while(!sair.equalsIgnoreCase("sim"));          
            
         
    }
}
