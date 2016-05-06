<%-- 
    Document   : cliente
    Created on : 4-mag-2016, 16.07.46
    Author     : Simone Balloccu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Cliente</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="keywords" content="tostapane, rosso, vendita">
        <meta name="description" content="Negozio">
        <meta name="author" content="Simone Balloccu">
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>
    <body>
        <header>
            <jsp:include page="header.jsp" />
        </header>
        <div id="page">
        <div id="sidebar">
            <jsp:include page="sidebar.jsp" />
        </div>
        
        <div id="content">
                <table>
                    <c:forEach var="articolo" items="${listaArticoli}">
                        <tr>
                            <td>Tostapane rosso ${Articolo.nome}</td>
                            <td><img title="${Articolo.nome}" alt="Tostapane ${Articolo.nome}" src="${Articolo.foto}" width="200" height="150"></td>
                            <td class="descrizione">${Articolo.descrizione}</td>
                            <td class="pezzi">${Articolo.disponibili}</td>
                            <td>${Articolo.prezzo}</td>
                            <td><a href="cliente.html">Aggiungi</a></td>
                        </tr>
                    </c:forEach>
                               
                </table>
            </table>
        </div>
        <!--NAVIGAZIONE!-->
        <div class="indice">
            <ul>
                <li><a href="descrizione.jsp">Homepage</a></li>
                <li><a href="login_servlet">login</a></li>
            </ul>
        </div>
        <footer>
            <jsp:include page="footer.jsp" />
        </footer>
    </body>
</html>
