package com.example.helloworld.resources;

import com.example.helloworld.core.Administrador;
import com.example.helloworld.core.User;
import com.example.helloworld.db.AdministradorDAO;

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

@Path("/Administrador")
@Produces(MediaType.APPLICATION_JSON)
public class AdministradorResource {
    
    private final AdministradorDAO administradorDAO;

    public AdministradorResource(AdministradorDAO administradorDAO){
        this.administradorDAO = administradorDAO;
    }

    @POST
    @UnitOfWork
    public Administrador createAdministrador(@Valid Administrador administrador) {
        return administradorDAO.create(administrador);
    }

    @GET
    @UnitOfWork
    public List<Administrador> listaAdministradores() {
        return administradorDAO.findAll();
    }

    @RolesAllowed("ADMIN")
    @GET
    @Path("/{administradorId}")
    @UnitOfWork
    public Administrador getAdministrador(@Auth User user, @PathParam("dispositivoId") OptionalLong dispositivoId){
    return findSafely(dispositivoId.orElseThrow(() -> new BadRequestException("ID do administrador é obrigatório!")));
    }

    @PUT
    @UnitOfWork
    public Administrador updateDispositivo(@Valid Administrador dispositivo){
        return administradorDAO.update(dispositivo);
    }

    @RolesAllowed("ADMIN")
    @DELETE
    @Path("/{dispositivoId}")
    @UnitOfWork
    public void deleteDispositivo(@Auth User user, @PathParam("dispositivoId") OptionalLong dispositivoId){
        administradorDAO.delete(findSafely(dispositivoId.orElseThrow(() -> new BadRequestException("ID do administrador é obrigatório!"))));
    }

    private Administrador findSafely(long dispositivoId) {
        return administradorDAO.findById(dispositivoId).orElseThrow(() -> new NotFoundException("Administrador não encontrado!"));
    }
}
