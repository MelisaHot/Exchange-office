<%-- 
  
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Menjacnica </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
      <form action="prviJSP.jsp" method="POST">
   <div style=" background-image: url('folder1/slika4.jpg'); height: 200px; width: 250px; ">
    <table style='color: rgb(0, 0, 77)'>
        <tr><td> <b>IZ VALUTE: </b> </td> <td> <b>U VALUTU: </b> </td></tr>
    <tr>
        <td> <img src="folder1/rsd.png" width="30"  height="15">
        <input type="radio" value="RSD" name="izvalute" checked="checked">RSD </td>
        <td><img src="folder1/rsd.png" width="30"  height="15">
            <input type="radio" value="RSD" name="uvalutu" checked="checked">RSD </td>
    </tr>
		
    <tr>
        <td><img src="folder1/eur.jpg" width="30"  height="15">
        <input type="radio" value="EUR" name="izvalute">EUR </td>
        <td><img src="folder1/eur.jpg" width="30"  height="15">
        <input type="radio" value="EUR" name="uvalutu">EUR </td>
	   
    </tr>
		
    <tr>
        <td><img src="folder1/usd.png" width="30"  height="15">
            <input type="radio" value="USD" name="izvalute">USD </td>
	<td><img src="folder1/usd.png" width="30"  height="15">
        <input type="radio" value="USD" name="uvalutu">USD</td>
    </tr>
    <tr>
        <td><img src="folder1/chf.png" width="30"  height="15">
            <input type="radio" value="CHF" name="izvaliute">CHF </td>
        <td><img src="folder1/chf.png" width="30"  height="15">
            <input type="radio" value="CHF" name="uvalutu">CHF</td>
    </tr>
    <tr>
        <td><img src="folder1/gbp.png" width="30"  height="15">
        <input type="radio" value="GBP" name="izvalute">GBP</td>
	<td><img src="folder1/gbp.png" width="30"  height="15">
        <input type="radio" value="BGP" name="uvalutu">BGP</td>
    </tr>
    <tr><td> <p> </p> </td> <td> <p> </p> </td></tr>
    <tr> <td><input type="number" min='0' name='vrednost'></td>
    <td><input type="Submit" value='Konvertuj'></td>
    </tr>
    </table>
      </form>
   </body>
</html>
