package com.ec.jackson;

import com.ec.entities.Persona;
import com.ec.repositories.PersonaRepository;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


@Path("/persona")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonaApi {
    @Inject
    PersonaRepository pd;


    @GET
    public List<Persona> List(){
        return pd.listPersonas();
    }

    @POST
    public Response add(Persona persona){
        pd.crearPersona(persona);
        return Response.ok().build();
    }

    @DELETE
    public Response delete(Persona persona){

        pd.borrarPersona(persona);
        return Response.ok().build();
    }
}
