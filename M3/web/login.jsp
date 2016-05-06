<%-- 
    Document   : login
    Created on : 4-mag-2016, 16.11.03
    Author     : Simone Balloccu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="keywords" content="login, membri, accesso">
        <meta name="description" content="Login per utenti">
        <meta name="author" content="Simone Balloccu">
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>
    <body>
        <header>
            <header>
                <jsp:include page="header.jsp" />
            </header>
        </header>
        <div id="page">
            <div id="sidebar">
                <jsp:include page="sidebar.jsp" />
            </div>
            <div id="content">
            <!--Form per il login nella pagina!-->
                <h1>Login</h1>
                <div class="needlogin">
                    <p>Per utilizzare il sito &egrave; necessario effettuare l'accesso. Puoi usare il form sottostante:</p>
                </div>
                <br>
                <div class="login">
                    <form action="login_servlet" method="post">
                        <label for="user">Username</label>
                        <input type="text" name="user" id="user" placeholder="il tuo user" />
                        <br>
                        <label for="password">Password</label>
                        <input type="password" name="password" id="password" placeholder="password" />
                        <br>
                        <input type="submit" name="button" value="Accedi" />
                    </form>
                </div>
        <!--Barra di navigazione!-->
                <div>
                    <h3>Indice</h3>
                    <ul>
                        <li><a href="descrizione.jsp">Homepage</a></li>
                        <li><a href="cliente.jsp">Negozio</a></li>
                        <li><a href="venditore_servlet">Inserisci un articolo</a></li>    
                    </ul>
                </div>
            </div>
        </div>
        <footer>
            <jsp:include page="footer.jsp" />
        </footer>
    </body>
</html>

