/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import modelo.Cliente;

/**
 *
 * @author Usuario
 */
@Stateless
@Path("modelo.cliente")
public class ClienteFacadeREST extends AbstractFacade<Cliente> {

    @PersistenceContext(unitName = "examenWebPU")
    private EntityManager em;

    public ClienteFacadeREST() {
        super(Cliente.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Cliente entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") String id, Cliente entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") String id) {
        super.remove(super.find(id));
    }
    
     @POST
    @Path("crear")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
     public String crear (@FormParam ("idCliente") String idCliente, @FormParam ("nombre") String nombre, @FormParam ("apellido") String apellido, @FormParam ("cedula") String cedula, @FormParam ("direccion") String direccion, @FormParam ("edad") String edad, @FormParam ("provincia") String provincia, @FormParam ("vehiculoCompro") String vehiculoCompro){
      Cliente ob = super.find(idCliente);
      ob.setNombre(nombre);
      ob.setApellido(apellido);
      ob.setCedula(cedula);
      ob.setDireccion(direccion);
      ob.setEdad(edad);
      ob.setProvincia(provincia);
      ob.setVehiculoCompro(vehiculoCompro);
     
      super.edit(ob);
      return "Se actualizo con exito";
    
     }
     
      @POST
    @Path("editar")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
     public String editar (@FormParam ("idCliente") String idCliente, @FormParam ("nombre") String nombre, @FormParam ("apellido") String apellido, @FormParam ("cedula") String cedula, @FormParam ("direccion") String direccion, @FormParam ("edad") String edad, @FormParam ("provincia") String provincia, @FormParam ("vehiculoCompro") String vehiculoCompro){          
     Cliente obb = super.find(idCliente);
     
     obb.setNombre(nombre);
     obb.setApellido(apellido);
     obb.setDireccion(direccion);
      obb.setEdad(edad);
      obb.setProvincia(provincia);
      obb.setVehiculoCompro(vehiculoCompro);
      
      super.edit(obb);
     return "Se actualizo";
     
     
     }
      
      

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Cliente find(@PathParam("id") String id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Cliente> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Cliente> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
    
}
