package br.com.locadora.resources;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.locadora.models.Carro;

@Path("/carros")
public class CarrosResource {

  @GET
  @Produces(value = MediaType.APPLICATION_JSON)
  public ArrayList<Carro> obterTodosCarros() {
    Carro carro1 = new Carro();
    carro1.nome = "Gol";
    carro1.placa = "ABC-123";

    ArrayList<Carro> lista = new ArrayList<>();
    lista.add((carro1));

    return lista;
  }

}
