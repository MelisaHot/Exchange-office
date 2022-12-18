
package menjacnicasocketserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MenjacnicaSocketServer {

    public static String menjacnica(String operacija1, String operacija2,float unos){
        double iznos=0;
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
    
    
    public static void main(String[] args) {
        System.out.println("The server is running!");
        try{
           
            while(true){
             ServerSocket serverSocket = new ServerSocket(5687);
            Socket sc = serverSocket.accept();
            try{
		DataInputStream inFromClient = new DataInputStream(sc.getInputStream());
                String operacija1 = inFromClient.readUTF();
                String operacija2 = inFromClient.readUTF();
		
                float unos = inFromClient.readFloat();

		PrintWriter pr = new PrintWriter(sc.getOutputStream(),true);
                DataOutputStream outFromClient = new DataOutputStream(sc.getOutputStream());
                outFromClient.writeUTF(menjacnica(operacija1, operacija2, unos));
               
                    
            }
		catch(Exception e){
		e.printStackTrace();
		}
		finally{
		sc.close();
		serverSocket.close();
				}
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
    }
    

