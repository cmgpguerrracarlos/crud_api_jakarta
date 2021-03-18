package com.cmgp.api;

import com.cmgp.db.clientedb;
import com.cmgp.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/clientes")
public class ClienteService {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cliente> getClientes(){
        List<Cliente> list = new ArrayList<>(); 
        list.add(clientedb.addClinete("Carlos Maria Guerra Perez", "48190043"));
        list.add(clientedb.addClinete("Carlos Maria Guerra", "48190043"));
        list.add(clientedb.addClinete("Carlos Guerra Perez", "48190043"));
        list.add(clientedb.addClinete("Guerra Perez", "48190043"));
        list.add(clientedb.addClinete("Maria Guerra Perez", "48190043"));
        list.add(clientedb.addClinete("Carlos Maria ", "48190043"));
        return list;
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Cliente addCliente(@FormParam("name") String name,@FormParam("ci") String ci){
        return new Cliente(name,ci);
    }
    
    @DELETE
    @Path("{id}")
    public Cliente deleteCliente(@PathParam("id") int id){
        return clientedb.findClineteById(id);
    }
}
