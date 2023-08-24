/**
 *
 * @author Vitória
 */
public class Main {
    public static void main(String[] args){
        /** Questão 4 */
        System.out.println("\n---- QUESTÃO 4 ----");
        System.out.println();
        Animal an1 = new Animal("Rufus", "Pastor Alemão");
        System.out.println(an1.nome+" inicia na posição "+an1.position+".");
        System.out.println("Após caminhar "+an1.nome+" está na posição "+an1.caminha(3)+".");
        System.out.println();
        Gato an2 = new Gato("Mary Jane", "SRD");
        System.out.println(an2.mia());
        System.out.println(an2.nome+" inicia na posição "+an2.position+".");
        System.out.println("Após caminhar "+an2.nome+" está na posição "+an2.caminha(5)+".");
        System.out.println();
        Cachorro an3 = new Cachorro("Juma", "SRD");
        System.out.println(an3.late());
        System.out.println(an3.nome+" inicia na posição "+an3.position+".");
        System.out.println("Após caminhar "+an3.nome+" está na posição "+an3.caminha(20)+".");
        System.out.println();
        /** FIM */
        System.out.println("\n=)\n");

    }
}
