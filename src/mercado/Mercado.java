package mercado;

public class Mercado {

    public static void main(String[] args) {

        //criação de clientes
        Cliente cliente1 = new Cliente("Jorje", "123.123.123-01");

        //criação de produtos
        Produto p1 = new Produto(38.40, "Tenis", 50);
        Produto p2 = new Produto(5.10, "Trator", 10);

        //Criação de itens
        Item i1 = new Item(p1, 50);
        Item i2 = new Item(p2, 50);

        //Criação de pedido
        Pedido pd1 = new Pedido(4.2, cliente1);
        pd1.adicionarItem(i1);
        pd1.adicionarItem(i2);

        System.out.println("nome cliente: " + pd1.getCliente().getNomeCliente());
        System.out.println("total: " + pd1.getValorTotal());

    }

    public static void Verificar() {
        if (Produto.getQuantidade() < Item.getQtdComprada()) {

            System.out.println("quantidade invalida");
        } else {
            Produto.getQuantidade() - Item.getQtdComprada();
        }

    }
}
