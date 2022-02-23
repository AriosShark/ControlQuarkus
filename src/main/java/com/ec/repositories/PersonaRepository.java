package com.ec.repositories;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import com.ec.entities.Persona;
import java.util.List;

@ApplicationScoped
public class PersonaRepository {
    @Inject
    EntityManager em;

    @Transactional
    public void crearPersona(Persona persona){
        em.persist(persona);
    }


    @Transactional
    public void borrarPersona(Persona persona){
        em.remove(persona);
    }

    @Transactional
    public List<Persona> listPersonas(){
        List<Persona> personas = em.createQuery("select persona from Persona persona").getResultList();
        return personas;
    }



}
