/**
 *
 * @author Vitória =)
 * */

import java.util.ArrayList;

public class Cliente {
    private String cpf, nome;
    private ArrayList<ContaCorrente> contas;

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        this.contas = new ArrayList<ContaCorrente>();
    }
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }

    public ArrayList<ContaCorrente> getContas() {
        return contas;
    }

    public void addConta(ContaCorrente conta){
        this.contas.add(conta);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", contas=" + contas +
                '}';
    }
}