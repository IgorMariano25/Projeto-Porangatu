package com.example.helloworld.resources;

import com.example.helloworld.core.Veiculo;
import com.example.helloworld.db.VeiculoDAO;
import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.POST;
import javax.validation.Valid;
import javax.ws.rs.GET;
import java.util.List;

@Path("/Veiculo")
@Produces(MediaType.APPLICATION_JSON)
public class VeiculoResource {
    
    private final VeiculoDAO veiculoDAO;

        public VeiculoResource(VeiculoDAO veiculoDAO){
            this.veiculoDAO = veiculoDAO;
        }

        @POST
        @UnitOfWork
        public Veiculo createVeiculo(@Valid Veiculo veiculo) {
            return veiculoDAO.create(veiculo);
        }

        @GET
        @UnitOfWork
        public List<Veiculo> listaVeiculo() {
            return veiculoDAO.findAll();
        }
}
