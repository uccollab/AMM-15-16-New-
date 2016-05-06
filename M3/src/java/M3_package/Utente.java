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
public abstract class Utente 
{
    protected int id;
    protected String username;
    protected String password;
    protected Saldo conto;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the conto
     */
    public Double getConto() {
        return conto.getFondi();
    }

    /**
     * @param conto the conto to set
     */
    public void setConto(Double conto) {
        this.conto.setFondi(conto);
    }
    
}
