package com.example.helloworld.resources;

import com.example.helloworld.core.Dispositivo;
import com.example.helloworld.core.User;
import com.example.helloworld.db.DispositivoDAO;

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

@Path("/Dispositivo")
@Produces(MediaType.APPLICATION_JSON)
public class DispositivoResource {

    private final DispositivoDAO dispositivoDAO;
    
    public DispositivoResource(DispositivoDAO dispositivoDAO) {
        this.dispositivoDAO = dispositivoDAO;
    }

    @POST
    @UnitOfWork
    public Dispositivo createDispositivo(@Valid Dispositivo dispositivo) {
        return dispositivoDAO.create(dispositivo);
    }

    @GET
    @UnitOfWork
    public List<Dispositivo> listaDispositivos() {
        return dispositivoDAO.findAll();
    }

    @RolesAllowed("ADMIN")
    @GET
    @Path("/{dispositivoId}")
    @UnitOfWork
    public Dispositivo getDispositivo(@Auth User user, @PathParam("dispositivoId") OptionalLong dispositivoId){
    return findSafely(dispositivoId.orElseThrow(() -> new BadRequestException("ID do dispositivo é obrigatório!")));
    }

    @PUT
    @UnitOfWork
    public Dispositivo updateDispositivo(@Valid Dispositivo dispositivo){
        return dispositivoDAO.update(dispositivo);
    }

    @RolesAllowed("ADMIN")
    @DELETE
    @Path("/{dispositivoId}")
    @UnitOfWork
    public void deleteDispositivo(@Auth User user, @PathParam("dispositivoId") OptionalLong dispositivoId){
        dispositivoDAO.delete(findSafely(dispositivoId.orElseThrow(() -> new BadRequestException("ID do dispositivo é obrigatório!"))));
    }

    private Dispositivo findSafely(long dispositivoId) {
        return dispositivoDAO.findById(dispositivoId).orElseThrow(() -> new NotFoundException("Dispositivo não encontrado!"));
    }
}
