/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M3_package;

/**
 *
 * @author Simone Balloccu
 */
import java.util.ArrayList;
public class M3_Factory 
{
    // Attributi
    private static M3_Factory singleton;
    public static M3_Factory getInstance() {
        if (singleton == null) {
            singleton = new M3_Factory();
        }
        return singleton;
    }
    private ArrayList<Articolo> listaArticoli = new ArrayList<Articolo>();
    private ArrayList<Utente> listaVenditori = new ArrayList<Utente>();
    private ArrayList<Utente> listaClienti = new ArrayList<Utente>();
    
    /* Costruttore */
    private M3_Factory() {
              
        // Articoli         
        Articolo art_1 = new Articolo();
        art_1.setId(0001);
        art_1.setNome("SMEG");
        art_1.setDisponibili(200);
        art_1.setPrezzo(150.0);
        art_1.setFoto("IMG/SMEG.jpg");
        art_1.setDescrizione("Eleganza e toast, senza compromessi");
        listaArticoli.add(art_1);
        
        Articolo art_2 = new Articolo();
        art_2.setId(0002);
        art_2.setNome("VINTAGE");
        art_2.setDisponibili(134);
        art_2.setPrezzo(200.0);
        art_2.setFoto("IMG/VINTAGE.jpg");
        art_2.setDescrizione("Tutto il fascino del tostapane anni 80, ma fatto nel duemila");
        listaArticoli.add(art_2);
        
        Articolo art_3 = new Articolo();
        art_3.setId(0003);
        art_3.setNome("VICEVERSA");
        art_3.setDisponibili(79);
        art_3.setPrezzo(320.0);
        art_3.setFoto("IMG/VICEVERSA.jpg");
        art_3.setDescrizione("Un tostapane che raffredda i toast invece di scaldarli? L'abbiamo fatto (nel duemila)!");
        listaArticoli.add(art_3);
        
        Articolo art_4 = new Articolo();
        art_4.setId(0004);
        art_4.setNome("MONSTER");
        art_4.setDisponibili(20);
        art_4.setPrezzo(850.0);
        art_1.setFoto("IMG/MONSTER.jpg");
        art_2.setDescrizione("Per i power users: fino a 4 toast contemporaneamente e controllo overheating");
        listaArticoli.add(art_4);
        
        Articolo art_5 = new Articolo();
        art_5.setId(0005);
        art_5.setNome("UNIQUE");
        art_5.setDisponibili(800);
        art_5.setPrezzo(75.0);
        art_1.setFoto("IMG/UNIQUE.jpg");
        art_1.setDescrizione("Senza fronzoli, economico e funzionale: non serve una fortuna per tostare come nel duemila!");
        listaArticoli.add(art_5);
        
        
        //Cliente 1
        Cliente cliente_1 = new Cliente();
        cliente_1.setUsername("PinkGuy");
        cliente_1.setPassword("gibedepu55ybo$$");
        cliente_1.setId(1);
        //cliente_1.setConto(33.0);
        listaClienti.add(cliente_1);
        
        //Cliente 2
        Cliente cliente_2 = new Cliente();
        cliente_2.setUsername("Claudio");
        cliente_2.setPassword("toffenglese");
        cliente_2.setId(2);
        //cliente_2.setConto(0.5);
        listaClienti.add(cliente_2);
        
        //Cliente 3
        Cliente cliente_3 = new Cliente();
        cliente_3.setUsername("InternetExplorer");
        cliente_3.setPassword("slowbrowser");
        cliente_3.setId(3);
        //cliente_3.setConto(33333333333333333.1);
        listaClienti.add(cliente_3);
        
        //Cliente 4
        Cliente cliente_4 = new Cliente();
        cliente_4.setUsername("Lollo");
        cliente_4.setPassword("COUGHCOUGH");
        cliente_4.setId(4);
        //cliente_4.setConto(128913923.3);
        listaClienti.add(cliente_4);
        
        //Cliente 5
        Cliente cliente_5 = new Cliente();
        cliente_5.setUsername("Hackerino");
        cliente_5.setPassword("STACCAH");
        cliente_5.setId(5);
        //cliente_5.setConto(39.0);
        listaClienti.add(cliente_5);
        
        //Venditore 1
        Venditore venditore_1 = new Venditore();
        venditore_1.setUsername("Zeb89");
        venditore_1.setPassword("PAGAH");
        venditore_1.setId(1);
        //venditore_1.setConto(13.0);
        listaVenditori.add(venditore_1);
        
        //Venditore 2
        Venditore venditore_2 = new Venditore();
        venditore_2.setUsername("scateni");
        venditore_2.setPassword("sorrentino");
        venditore_2.setId(2);
        //venditore_2.setConto(1128.3);
        listaVenditori.add(venditore_2);
    }
    
    /* Metodi */
    public Articolo getArticoliById(int id)
    {
        for(Articolo a : listaArticoli)
        {
            if(a.getId()==id)
            {
               return a;
            }
        }
    return null;
    }
    
    public Articolo getArticoliByPrice(int prezzo)
    {
        for(Articolo a : listaArticoli)
        {
            if(a.getPrezzo()==prezzo)
            {
               return a;
            }
        }
    return null;
    }
    
    public Articolo getArticoliByName(String nome)
    {
        for(Articolo a : listaArticoli)
        {
            if(a.getNome().equals(nome))
            {
               return a;
            }
        }
    return null;
    }

    public Articolo getArticoliglobal()
    {
        for(Articolo a : listaArticoli)
        {
            return a;
        }
    return null;
    }
    
    public Utente getClientebyusername(String username)
    {
        for(Utente c: listaClienti)
        {
            if(c.getUsername().equals(username))
                return c;
        }
    return null;
    }
    
    public Utente getVenditorebyusername(String username)
    {
        for(Utente v: listaVenditori)
        {
            if(v.getUsername().equals(username))
                return v;
        }
    return null;
    }
    
    public ArrayList<Utente> getListaVenditori()
    {
        return listaVenditori;
    }
    
    public ArrayList<Utente> getListaClienti()
    {
        return listaClienti;
    }
    
    public ArrayList<Utente> getListaUtenti()
    {
        ArrayList<Utente> listaUtenti = new ArrayList<Utente>();
        
        listaUtenti.addAll(listaVenditori);
        listaUtenti.addAll(listaClienti);
        
        return listaUtenti;
    }
}