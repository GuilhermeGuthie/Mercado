
package mercado;

public class Cliente {

    public Cliente(String nomeCliente, String cpf) {
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
    }
    
   
    private String nomeCliente;
    private String cpf;

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
