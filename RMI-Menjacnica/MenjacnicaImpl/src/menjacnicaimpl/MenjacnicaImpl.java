
package menjacnicaimpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import menjacnicarmi.MenjacnicaInterface;


public class MenjacnicaImpl extends UnicastRemoteObject implements MenjacnicaInterface {

   public MenjacnicaImpl() throws RemoteException {
            super();
	}
    public String menjacnica(String operacija1,String operacija2, float unos) throws RemoteException{
        double iznos=20;
        if(operacija1.equals("RSD")){
            if(operacija2.equals("RSD")){
                iznos=unos;
            }else if(operacija2.equals("EUR")){
                iznos=unos/120;
            } else if(operacija2.equals("USD")){
                iznos=unos/103;
            }else if(operacija2.equals("CHF")){
                iznos=unos/104;
            } else if(operacija2.equals("GBP")){
                iznos=unos/133;
            }
         
        }else if(operacija1.equals("EUR")){
           if(operacija2.equals("RSD")){
                iznos=unos*120;
            }else if(operacija2.equals("EUR")){
                iznos=unos;
            }else if(operacija2.equals("USD")){
                iznos=unos*1.15;
            }else if(operacija2.equals("CHF")){
                iznos=unos*1.15;
            } else if(operacija2.equals("GBP")){
                iznos=unos*0.9;
            }     
        }else if(operacija1.equals("USD")){
           if(operacija2.equals("RSD")){
                iznos=unos*103;
            }else if(operacija2.equals("EUR")){
                iznos=unos*0.9;
            }else if(operacija2.equals("USD")){
                iznos=unos;
            }else if(operacija2.equals("CHF")){
                iznos=unos*1.1;
            } else if(operacija2.equals("GBP")){
                iznos=unos*0.8;
            }     
        }else if(operacija1.equals("CHF")){
           if(operacija2.equals("RSD")){
                iznos=unos*104;
            }else if(operacija2.equals("EUR")){
                iznos=unos*0.9;
            }else if(operacija2.equals("USD")){
                iznos=unos*1.1;
            }else if(operacija2.equals("CHF")){
                iznos=unos;
            } else if(operacija2.equals("GBP")){
                iznos=unos*0.8;
            }
        }else if(operacija1.equals("GBP")){
           if(operacija2.equals("RSD")){
                iznos=unos*133;
            }else if(operacija2.equals("EUR")){
                iznos=unos*1.5;
            }else if(operacija2.equals("USD")){
                iznos=unos*1.3;
            }else if(operacija2.equals("CHF")){
                iznos=unos*1.3;
            } else if(operacija2.equals("GBP")){
                iznos=unos;
            }
        }
        else iznos=0;
        
      return String.valueOf(iznos);
        
        
    }

    
    
}
