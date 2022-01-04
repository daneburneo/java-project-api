package br.com.supermercado.api.resources;

import br.com.supermercado.api.models.Produto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("/produtos")
public class ProdutosResource {

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public ArrayList<Produto> pegarProdutos() {
        Produto produto1 = new Produto();
        produto1.setNome("Arroz");
        produto1.setPreco(5.0);
        produto1.setCodigoDeBarras("shgd7rG7dts4rg6dr918dft1h9d4th");

        Produto produto2 = new Produto();
        produto2.setNome("Geladeira");
        produto2.setPreco(2000.0);
        produto2.setCodigoDeBarras("9erg97r84r8b4ds8r4d8r4d8r4d84");

        ArrayList<Produto> lista = new ArrayList<>();
        lista.add(produto1);
        lista.add(produto2);

        return lista;
    }
}
