<?php
	$operacija1=$_POST["izvalute"];
	$operacija2=$_POST["uvalutu"];
	$unos=$_POST["iznos"];
	
               
?>

<?php
function menjacnica($operacija1, $operacija2,$unos){
	$rezultat = (float)0;
	if($unos=='')
		$unos = (float) 0;
	else{
          
		 if($operacija1=="RSD"){
            if($operacija2=="RSD"){
                $iznos=$unos;
            }else if($operacija2=="EUR"){
                $iznos=$unos/120;
            } else if ($operacija2=="USD"){
                $iznos=$unos/103;
            }else if ($operacija2=="CHF"){
                $iznos=$unos/104;
            } else if ($operacija2=="GBP"){
                $iznos=$unos/133;
            }
         
        }else if ($operacija1=="EUR"){
           if ($operacija2=="RSD"){
                $iznos=$unos*120;
            }else if ($operacija2=="EUR"){
                $iznos=$unos;
            }else if ($operacija2=="USD"){
                $iznos=$unos*1.15;
            }else if ($operacija2=="CHF"){
                $iznos=$unos*1.15;
            } else if ($operacija2=="GBP"){
                $iznos=$unos*0.9;
            }     
        }else if ($operacija1=="USD"){
           if ($operacija2=="RSD"){
                $iznos=$unos*103;
            }else if ($operacija2=="EUR"){
                $iznos=$unos*0.9;
            }else if ($operacija2=="USD"){
                $iznos=$unos;
            }else if ($operacija2=="CHF"){
                $iznos=$unos*1.1;
            } else if ($operacija2=="GBP"){
                $iznos=$unos*0.8;
            }     
        }else if ($operacija1=="CHF"){
           if ($operacija2=="RSD"){
                $iznos=$unos*104;
            }else if ($operacija2=="EUR"){
                $iznos=$unos*0.9;
            }else if ($operacija2=="USD"){
                $iznos=$unos*1.1;
            }else if ($operacija2=="CHF"){
                $iznos=$unos;
            } else if ($operacija2=="GBP"){
                $iznos=$unos*0.8;
            }
        }else if ($operacija1=="GBP"){
           if ($operacija2=="RSD"){
                $iznos=$unos*133;
            }else if ($operacija2=="EUR"){
                $iznos=$unos*1.5;
            }else if ($operacija2=="USD"){
                $iznos=$unos*1.3;
            }else if ($operacija2=="CHF"){
                $iznos=$unos*1.3;
            } else if ($operacija2=="GBP"){
                $iznos=$unos;
            }
        }
        else $iznos=0;
        
        
        
    }
	echo $iznos;
	
}
?>


<html>
    <head>
        <title>Menjacnica</title>
		<style>
			a:link{color: rgb(0, 0, 71);}
			a:hover{color: blue;}
		</style>
    </head>
    <body>
        <div style="background-image: url('slike/slika4.jpg'); height: 200px; width: 250px;">
        <table style='color: rgb(0, 0, 77)'><tr><td><b>Rezultat:</b></td></tr>
            <tr><td><input type="text" size="15" value="<?php menjacnica($operacija1,$operacija2, $unos); ?>"/></td></tr>
        <tr><td><a href="menjacnica.html">Vrati se na pocetnu stranu.</a></td></tr></table>
        </div>
    </body>
</html>
