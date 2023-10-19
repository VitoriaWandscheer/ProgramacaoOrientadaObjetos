/**
 *
 * @author Alunos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triatleta vitoria = new Triatleta("Vitoria", "11111111111", 52.8, 1.60); //Cria um novo atleta na variável vitoria.
        
        vitoria.aquecer(); //Faz vitoria aquecer.
        vitoria.correr(); //Faz vitoria correr.
        vitoria.nadar(); //Faz vitoria nadar.
        vitoria.pedalar(); //Faz vitoria pedalar.
        System.out.println("");
        System.out.println(vitoria); //Traz os dados de vitoria.
    }
    
}
