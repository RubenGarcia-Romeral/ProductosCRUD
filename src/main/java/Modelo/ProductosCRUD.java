
package Modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Ruben
 */
public class ProductosCRUD {
     public static int destroyProducto(int id) {
         
         
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.mycompany_CRUDproductos_war_1.0-SNAPSHOTPU");
        EntityManager manager = factory.createEntityManager();
        
        
        String sql = "DELETE from Productos p WHERE p.id =" + id;
        
        Query q = manager.createQuery(sql);
        manager.getTransaction().begin();
        
        
        int filasAfectadas = q.executeUpdate(); 
        
        
        manager.getTransaction().commit();
        
        
        return filasAfectadas;  
        
    }
}
