package com.example.helloworld.db;

import com.example.helloworld.core.Motorista;
import io.dropwizard.hibernate.AbstractDAO;

import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Optional;

public class MotoristaDAO extends AbstractDAO<Motorista>{
    public MotoristaDAO(SessionFactory factory){
        super(factory);
    }

    public Optional<Motorista> findById(Long id) {
        return Optional.ofNullable(get(id));
    }

    public Motorista create(Motorista motorista) {
        return persist(motorista);
    }

    public List<Motorista> findAll() {
        return list(namedTypedQuery("com.example.helloworld.core.Motorista.findAll"));
    }
}
