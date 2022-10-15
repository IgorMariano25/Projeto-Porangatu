package com.example.helloworld.db;

import com.example.helloworld.core.Administrador;
import io.dropwizard.hibernate.AbstractDAO;

import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Optional;
public class AdministradorDAO extends AbstractDAO<Administrador> {
    public AdministradorDAO(SessionFactory factory) {
        super(factory);
    }

    public Administrador create(Administrador administrador){
        return persist(administrador);
    }

    public List<Administrador> findAll() {
        return list(namedTypedQuery("com.example.helloworld.core.Administrador.findAll"));
    }
}
