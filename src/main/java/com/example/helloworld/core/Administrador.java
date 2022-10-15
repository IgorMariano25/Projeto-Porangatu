package com.example.helloworld.core;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.NamedQuery;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.util.Objects;

@Entity
@Table(name = "Administrador")
@NamedQuery(
    name = "com.example.helloworld.core.Administrador.findAll",
    query = "SELECT a FROM a"
)
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "jobTitle", nullable = false)
    private String jobTitle;

    public Administrador() {
    }

    public Administrador(String firstName, String lastName, String jobTitle){
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
    }

    public void setId(long id){
        this.id = id;
    }

    public void getFirstName(String firstName){
        this.firstName = firstName;
    }

    public void getLastName(String lastName){
        this.lastName = lastName;
    }

    public void getJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Administrador)) {
            return false;
        }
        Administrador administrador = (Administrador) o;
        return id == administrador.id && 
                Objects.equals(firstName, administrador.firstName) && 
                Objects.equals(lastName, administrador.lastName) && 
                Objects.equals(jobTitle, administrador.jobTitle);
    }
}
