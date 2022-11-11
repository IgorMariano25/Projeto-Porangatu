package com.example.helloworld.resources;

import com.example.helloworld.core.Veiculo;
import com.example.helloworld.db.VeiculoDAO;

import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.POST;
import javax.validation.Valid;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.NotFoundException;

import java.util.List;
import java.util.OptionalLong;

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

        @GET
        @Path("/{veiculoId}")
        @UnitOfWork
        public Veiculo getVeiculo(@PathParam("veiculoId") OptionalLong veiculoId){
        return findSafely(veiculoId.orElseThrow(() -> new BadRequestException("ID do dispositivo é obrigatório!")));
        }

        @PUT
        @UnitOfWork
        public Veiculo updateVeiculo(@Valid Veiculo veiculo){
            return veiculoDAO.update(veiculo);
        }

        private Veiculo findSafely(long veiculoId) {
            return veiculoDAO.findById(veiculoId).orElseThrow(() -> new NotFoundException("Veículo não encontrado!"));
        }
}
