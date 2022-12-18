<%-- 
    Document   : prviJSP
    Created on : Mar 6, 2019, 11:37:14 PM
    Author     : Hajruš Hot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    double unos;
    double iznos = 0.00;
    String rez;
%>

<%String operacija1=request.getParameter("izvalute");
  String operacija2=request.getParameter("uvalutu");
  String vr=request.getParameter("vrednost");
%>

<%!
   public String menjacnica(String operacija1, String operacija2,String vr){
    if(vr.equals(""))
        unos = 0;
    else
        unos = Double.valueOf(vr);
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
                iznos = unos*1.15;
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
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menjacnica</title>
        <style>
            a:link{color: rgb(0, 0, 77)}
            a:hover{color: blue;}
        </style>
    </head>
    <body>
        <div style="background-image: url('folder1/slika4.jpg'); height: 200px; width: 250px;">
            <table style="color: rgb(0, 0, 77)"><tr><td><b>Rezultat:</b></td></tr>
            <tr><td><input type="text" value="<%out.print(menjacnica(operacija1, operacija2, vr));%>"/></td></tr>
        <tr><td><a href="index.jsp">Vrati se na pocetnu stranu.</a></td></tr></table>
        </div>
    </body>
</html>
