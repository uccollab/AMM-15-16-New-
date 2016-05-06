<%-- 
    Document   : venditore
    Created on : 4-mag-2016, 16.12.57
    Author     : Simone Balloccu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Inserisci un articolo</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="keywords" content="inserire, annuncio, tostapane, rosso">
        <meta name="description" content="Inserimento articolo">
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
        <!--FORM PER L'INSERIMENTO!-->
            <div id="content">
                <div class="venditore">
                    
                    <h1>Inserisci un articolo</h1>
                    <p>
                        ${Nome}
                        <br>
                        ${URL}
                        <br>
                        ${Descrizione}
                        <br>
                        ${Prezzo}
                        <br>
                        ${Quantita}
                        
                    
                    
                    
                    </p>
                    <form method="get" action="venditore_servlet">
                        <label for="Nome">Nome:</label>
                        <input type="text" name="Nome" id="Nome" placeholder="Niente di troppo lungo!"/>
                        <br>
                        <label for="URL">Immagine (link):</label>
                        <input type="text" name="URL" id="URL" placeholder="Assicurati sia attivo"/>
                        <br>
                        <label for="Descrizione">Descrizione:</label>
                        <textarea rows="5" cols="15" name="Descrizione" id="Descrizione" placeholder="Una breve descrizione di cosa offre il tuo articolo"></textarea>
                        <br>
                        <label for="Prezzo">Prezzo:</label>
                        <input type="text" name="Prezzo" id="Prezzo"/>€
                        <br>
                        <label for="Quantita">Pezzi:</label>
                        <input type="text" name="Quantita" id="Quantita"/> 
                        <br>
                        <input type="submit" name="button" value="Invia" />
                    </form>
                </div>    
        <!--NAVIGAZIONE!-->
                <div>
                    <ul>
                        <li><a href="descrizione.jsp">Homepage</a></li>
                        <li><a href="login_servlet">login</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <footer>
            <jsp:include page="footer.jsp" />
        </footer>
    </body>
</html>
