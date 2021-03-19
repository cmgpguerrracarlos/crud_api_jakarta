package com.cmgp.model;

import com.cmgp.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClienteDao {
    private static List<Cliente> clientes = new ArrayList<>();
    private static int lastid = 0;
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("clientesapi");
    
    public static List<Cliente> getClientes(){
        clientes.add(ClienteDao.addClinete("Carlos Maria Guerra Perez", "48190043"));
        clientes.add(ClienteDao.addClinete("Carlos Maria Guerra", "48190043"));
        clientes.add(ClienteDao.addClinete("Carlos Guerra Perez", "48190043"));        
        return clientes;
    }
    
    public static Cliente addClinete(String name, String ci){

        Cliente nc = new Cliente(name,ci);
        emf.createEntityManager().getTransaction().begin();
        emf.createEntityManager().persist(nc);
        emf.createEntityManager().getTransaction().commit();
        emf.close();
        return nc;
    }
    
    public static Cliente findClineteById(int id){
        if(lastid != 0){
            for(Cliente c: clientes){
                if(c.getId() == id){
                    return c;
                }
            }
        }
        return null;
    }
    
    public static Cliente updateCliente(Cliente c){
        
        return null;
    }
    
}
