
package menjacnicarmiserver;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import menjacnicaimpl.MenjacnicaImpl;


public class MenjacnicaRMIServer {

    public static void main(String[] args) {
         Registry reg;
            try
            {
                reg = LocateRegistry.createRegistry(5454);
                MenjacnicaImpl c = new MenjacnicaImpl();
                reg.rebind("ExchangeService",c);
                System.out.println("Server is running!");
            
            }
            catch(Exception e)
            {
            System.out.println(e.toString());
            }
    }
    
}
