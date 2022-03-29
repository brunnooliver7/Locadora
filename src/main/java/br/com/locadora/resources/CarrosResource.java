package br.com.locadora.resources;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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

  @GET
  @Path("/{id}")
  @Produces(value = MediaType.APPLICATION_JSON)
  public Carro obterCarro(@PathParam("id") Long id) {
    
    Carro carro1 = new Carro();
    carro1.id = 1L;
    carro1.nome = "Carro 1";
    carro1.placa = "ABC-1234";
    
    Carro carro2 = new Carro();
    carro2.id = 2L;
    carro2.nome = "Carro 2";
    carro2.placa = "ABC-1234";
    
    Carro carro3 = new Carro();
    carro3.id = 3L;
    carro3.nome = "Carro 2";
    carro3.placa = "ABC-1234";

    ArrayList<Carro> lista = new ArrayList<>();
    lista.add(carro1);
    lista.add(carro2);
    lista.add(carro3);

    return lista.stream()
      .filter(carro -> carro.id.equals(id))
      .findFirst()
      .orElse(null);
  }

}
