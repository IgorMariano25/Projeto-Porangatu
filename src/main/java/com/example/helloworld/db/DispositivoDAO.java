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
}
