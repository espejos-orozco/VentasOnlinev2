/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.Personal;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author LeoNa
 */
@Stateless
@Path("entities.personal")
public class PersonalFacadeREST extends AbstractFacade<Personal> {

    @PersistenceContext(unitName = "VentasOnlinePU")
    private EntityManager em;

    public PersonalFacadeREST() {
        super(Personal.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Personal entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Personal entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Personal find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Personal> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Personal> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    @POST
    @Path("findsession/{password}/{usuario}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Personal findsession(@PathParam("password") String password, @PathParam("usuario") String usuario) {
        int personal_id = -1;
        List<Personal> personals = super.findAll();
        
        for (int i = 0; i < personals.size(); i++) {
            if(personals.get(i).getUsuario().equals(usuario)){
                if(personals.get(i).getPassword().equals(password)){
                    if(personals.get(i).getActivo().equals("1") && personals.get(i).getAccesoSistema().equals("1")){
                        personal_id = personals.get(i).getPersonalId();
                        i = personals.size();
                    }
                }
            }
        }
        return super.find(personal_id);
    }
    
    @POST
    @Path("{nombre}/{apellido}/{fecha_nacimiento_date}/{acceso_sistema}/{usuario}/{password}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Personal insert(@PathParam("password") String password, @PathParam("usuario") String usuario) {
        int personal_id = -1;
        List<Personal> personals = super.findAll();
        
        for (int i = 0; i < personals.size(); i++) {
            if(personals.get(i).getUsuario().equals(usuario)){
                if(personals.get(i).getPassword().equals(password)){
                    if(personals.get(i).getActivo().equals("1") && personals.get(i).getAccesoSistema().equals("1")){
                        personal_id = personals.get(i).getPersonalId();
                        i = personals.size();
                    }
                }
            }
        }
        return super.find(personal_id);
    }
}
