
package mercado;


public class Pedido {

    public Pedido(double valorTotal, Cliente cliente) {
        this.valorTotal = valorTotal;
        this.cliente = cliente;
    }


    
    private Item itens[] = new Item[5];
    private double valorTotal;
    private Cliente cliente;

    public Item[] getItens() {
        return this.itens;
    }

    public double getValorTotal() {
        return this.valorTotal;
    }

    public Cliente getCliente() {
        return this.cliente;
    }
    private int vc = 0;
    
    public void adicionarItem(Item item){
    
    itens[this.vc] = item;
     this.vc++;
    this.valorTotal += (item.getQtdComprada() + item.getProduto().getPreco());
    }
    }
    

