package com.example.helloworld.db;

import com.example.helloworld.core.Administrador;
import io.dropwizard.hibernate.AbstractDAO;

import org.hibernate.SessionFactory;

import java.util.List;
public class AdministradorDAO extends AbstractDAO<Administrador> {
    public Administrador create(Administrador administrador){
        return persist(administrador);
    }
}
