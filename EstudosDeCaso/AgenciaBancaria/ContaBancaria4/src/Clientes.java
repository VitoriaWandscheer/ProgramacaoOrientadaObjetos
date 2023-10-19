/**
 *
 * @author Vitória =)
 * */

import java.util.ArrayList;
public class Clientes {
    private ArrayList<Cliente> clientes;

    public Clientes() {
        this.clientes = new ArrayList<Cliente>();
    }

    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public void imprimirClientes() {
        for (Cliente cliente : this.clientes) {
            System.out.println(cliente.getNome()+": "+cliente.getContas());
        }
    }
}
