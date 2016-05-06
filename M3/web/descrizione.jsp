<%-- 
    Document   : descrizione
    Created on : 4-mag-2016, 16.08.19
    Author     : Simone Balloccu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Descrizione</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="keywords" content="red, millennium, toast">
        <meta name="description" content="Homepage del sito">
        <meta name="author" content="Simone Balloccu">
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>
    <body>
        <header>
            <header>
            <jsp:include page="header.jsp" />
        </header>
        <div id="page">
            <div id="sidebar">
                <jsp:include page="sidebar.jsp" />
            </div>
            <div id="content">
                <h3>Indice</h3>
                <ul>
                    <li><a href="#about">About: su di noi</a></li>
                    <li><a href="#sicurezza">Sicurezza: non &egrave; solo un tostapane</a></li>
                    <li><a href="#rimborso">Rimborso garantito</a></li>    
                </ul>
                <h1>Red Millennium Toast: il tostapane che cercavi</h1>
                <a id='about'>
                    <h2>About: su di noi</h2>
                </a>
                <p>Red Millennium Toast è l'unico sito sul web che ti permette di vendere i tuoi tostapane rossi
                prodotti nell'anno 2000, con tutta la sicurezza e l'assistenza garantita dalla nostra
                professionalità. Avrai a disposizione una bacheca personale da cui gestire tutti i tuoi
                prodotti, e tenere d'occhio chi è interessato al tuo tostapane. Per chi vuole acquistare
                sarà possibile comunicare col venditore e ricevere assistenza gratuita in ogni momento.</p>
                <a id='sicurezza'>
                    <h2>Sicurezza: non &egrave; solo un tostapane</h2>
                </a>
                <p>Red Millennium Toast comprende quanto tu tenga al tuo tostapane rosso del 2000. I nostri esperti
                hanno studiato per anni questi meravigliosi marchingegni, e hanno focalizzato i loro sforzi sulla 
                creazione della migliore esperienza e-commerce possibile per l'articolo. Il sito non ti lascer&agrave; 
                mai confuso o spaesato: tutto ci&ograve; che ti serve &egrave; qui, al suo posto.</p>
                <a id='rimborso'>
                    <h2>Rimborso garantito</h2>
                </a>
                <p>Comprare un tostapane rosso del 2000 non &egrave; certamente facile: e se il modello che hai comprato 
                non rispecchiasse ciò che ricevi? Se il tostapane non funzionasse? Nel peggiore dei casi potresti ricevere 
                a casa un tostapane che non &egrave; rosso. Red Millennium Toast vuole che questi disagi siano il tuo ultimo pensiero
                e ti guider&agrave; in ogni fase della transazione, tenendosi in contatto col venditore, il tutto con la massima 
                sicurezza. Ecco un dato interessante: Il 75% dei nostri clienti riceve a casa un tostapane rosso, mentre il 
                restante 25% riceve un rimborso entro una settimana dall'arrivo del pacco incriminato.</p>
                <!--BARRA DI NAVIGAZIONE!-->
                <div class="intro">
                    <p>Che aspetti? Corri a registrarti e inizia a vendere (o comprare) il tostapane dei tuoi sogni: <a href="/login_servlet">login</a></p>
                </div>
            </div>
        </div>
        <footer>
            <jsp:include page="footer.jsp" />
        </footer>
    </body>
</html>
