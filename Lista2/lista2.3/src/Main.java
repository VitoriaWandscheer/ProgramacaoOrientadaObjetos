public class Main {
    public static void main(String[] args){
        /** Questão 3 */
        System.out.println("\n---- QUESTÃO 3 ----");
        System.out.println();
        Funcionario func1 = new Funcionario("Vitória", "Rua da Felicidade, nº 3", "vitoria@email.com", "47992922929");
        System.out.println("-- Classe Funcionario | Método toString:");
        System.out.println(func1);
        System.out.println();
        Assistente ass = new Assistente("Luis", "Rua da Esperança, nº 13", "luis@email.com", "47991919191", 333);
        System.out.println("-- Classe Assistente | Método toString:");
        System.out.println(ass);
        System.out.println();
        Tecnico tec = new Tecnico("Dayane", "Rua da Beleza", "day@email.com", "47981818181", 334, 460);
        System.out.println("-- Classe Técnico | Método toString:");
        System.out.println(tec);
        System.out.println();
        Administrativo adm1 = new Administrativo("Rafael", "Rua do Amor, nº 15", "rafa@email.com", "47971717171", 232, "nOtuRno", 120);
        System.out.println("-- Classe Adminisrativo | Método toString:");
        System.out.println(adm1);
        Administrativo adm2 = new Administrativo("Pietra", "Rua da Amizade, nº 21", "pie@email.com", "47912121212", 129, "Diurno", 0);
        System.out.println(adm2);
        System.out.println();
        System.out.println("O número de matricula do funcionário(a) "+adm1.getNome()+" é "+adm1.getNumeroMatricula()+".");
        System.out.println("O número de matricula do funcionário(a) "+adm2.getNome()+" é "+adm2.getNumeroMatricula()+".");

        /** FIM */
        System.out.println("\n=)\n");
    }
}
