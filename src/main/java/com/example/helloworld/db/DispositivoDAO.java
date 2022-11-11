package com.example.helloworld.db;

import com.example.helloworld.core.Dispositivo;
import io.dropwizard.hibernate.AbstractDAO;

import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Optional;
public class DispositivoDAO extends AbstractDAO<Dispositivo>{
    public DispositivoDAO(SessionFactory factory){
        super(factory);
    }

    public Optional<Dispositivo> findById(Long id){
        return Optional.ofNullable(get(id));
    }

    public Dispositivo create(Dispositivo dispositivo){
        return persist(dispositivo);
    }

    public List<Dispositivo> findAll() {
        return list(namedTypedQuery("com.example.helloworld.core.Dispositivo.findAll"));
    }

    public Dispositivo update(Dispositivo dispositivo){
        return persist(dispositivo);
    }
}
