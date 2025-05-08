import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Classe e um conjunto de objetos
        //Nosso objetivo nesse código é entender a diferença entre método com o tipo void e método com tipo string
        Mamifero m1 = new Mamifero();
        m1.setNomeCientifico("Bos Taurus");
        JOptionPane.showMessageDialog(null, "nome Cientifico:"+m1.getNomeCientifico());

        /*
         * diferença entre função e procedimento
         * set - void (procedimento)
         * get - string (função)
         * java = Métodos
         *      void
         *      string, int, boolean
         * 
         * Desafio:
         * Crie mais dois objetos:
         * Para armazenar e mostrar os dados
         * Canguru
         * Peixe Boi
         */

         Mamifero m2 = new Mamifero();
        m2.setNomeCientifico("Trichechus");
        JOptionPane.showMessageDialog(null, "nome Cientifico:"+m2.getNomeCientifico());

        Mamifero m3 = new Mamifero();
        m3.setNomeCientifico("Macropus rufus");
        JOptionPane.showMessageDialog(null, "nome Cientifico:"+m3.getNomeCientifico());

    }
}
