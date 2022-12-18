
package menjacnicarmi;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface MenjacnicaInterface extends Remote{
    public String menjacnica (String operacija1,String operacija2, float unos) throws RemoteException;
    
}
