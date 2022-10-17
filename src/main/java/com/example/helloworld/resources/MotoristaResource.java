package com.example.helloworld.resources;

import com.example.helloworld.core.Motorista;
import com.example.helloworld.db.MotoristaDAO;
import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.POST;
import javax.validation.Valid;
import javax.ws.rs.GET;
import java.util.List;

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

    @GET
    @UnitOfWork
    public List<Motorista> listaMotoristas() {
        return motoristaDAO.findAll();
    }
}
