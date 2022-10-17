package com.example.helloworld.db;

import com.example.helloworld.core.Veiculo;
import io.dropwizard.hibernate.AbstractDAO;

import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Optional;
public class VeiculoDAO extends AbstractDAO<Veiculo>{
    public VeiculoDAO(SessionFactory factory) {
        super(factory);
    }

    public Optional<Veiculo> findById(Long id){
        return Optional.ofNullable(get(id));
    }

    public Veiculo create(Veiculo veiculo) {
        return persist(veiculo);
    }

    public List<Veiculo> findAll() {
        return list(namedTypedQuery("com.example.helloworld.core.Veiculo.findAll"));
    }
}
