package com.cmgp.db;

import com.cmgp.model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class clientedb {
    private static List<Cliente> clientes = new ArrayList<>();
    private static int lastid = 0;
    
    public static List<Cliente> getClientes(){
        return clientes;
    }
    
    public static Cliente addClinete(String name, String ci){
        lastid++;
        Cliente nc = new Cliente(name,ci);
        nc.setId(lastid);
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
