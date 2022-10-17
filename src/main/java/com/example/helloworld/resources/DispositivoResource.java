package com.example.helloworld.resources;

import com.example.helloworld.core.Dispositivo;
import com.example.helloworld.db.DispositivoDAO;

import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.POST;
import javax.validation.Valid;
import javax.ws.rs.GET;
import java.util.List;

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
}
