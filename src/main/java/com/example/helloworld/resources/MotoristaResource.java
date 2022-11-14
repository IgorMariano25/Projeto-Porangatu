package com.example.helloworld.resources;

import com.example.helloworld.core.Motorista;
import com.example.helloworld.db.MotoristaDAO;
import com.example.helloworld.core.User;

import io.dropwizard.auth.Auth;
import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.query.Query;

import javax.ws.rs.POST;
import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.NotFoundException;

import java.util.List;
import java.util.OptionalLong;

@Path("/Motorsita")
@Produces(MediaType.APPLICATION_JSON)
public class MotoristaResource {
    
    private final MotoristaDAO motoristaDAO;

    public MotoristaResource(MotoristaDAO motoristaDAO){
        this.motoristaDAO = motoristaDAO;
    }

    @POST
    @UnitOfWork
    public Motorista createMotorista(@Valid Motorista motorista) {
        return motoristaDAO.create(motorista);
    }

    @PUT
    @UnitOfWork
    public Motorista updateMotorista(@Valid Motorista motorista){
        return motoristaDAO.update(motorista);
    }

    @GET
    @UnitOfWork
    public List<Motorista> listaMotoristas() {
        return motoristaDAO.findAll();
    }

    @RolesAllowed("ADMIN")
    @GET
    @Path("/{motoristaId}")
    @UnitOfWork
    public Motorista getMotorista(@Auth User user, @PathParam("motoristaId") OptionalLong motoristaId){
    return findSafely(motoristaId.orElseThrow(() -> new BadRequestException("ID do motorista é obrigatório!")));
    }

    @RolesAllowed("ADMIN")
    @DELETE
    @Path("/{motoristaId}")
    @UnitOfWork
    public void deleteMotorista(@Auth User user, @PathParam("motoristaId") OptionalLong motoristaId){
        motoristaDAO.delete(findSafely(motoristaId.orElseThrow(() -> new BadRequestException("ID do motorista é obrigatório!"))));
    }

    private Motorista findSafely(long motoristaId) {
        return motoristaDAO.findById(motoristaId).orElseThrow(() -> new NotFoundException("Motorista não encontrado!"));
    }
}
