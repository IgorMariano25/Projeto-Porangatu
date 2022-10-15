package com.example.helloworld.db;

import com.example.helloworld.core.Dispositivo;
import io.dropwizard.hibernate.AbstractDAO;

import org.hibernate.SessionFactory;

import java.util.List;
public class DispositivoDAO extends AbstractDAO<Dispositivo>{
    public DispositivoDAO(SessionFactory factory){
        super(factory);
    }
}
