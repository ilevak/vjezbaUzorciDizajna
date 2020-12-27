/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.List;

/**
 *
 * @author ivale
 */
public class Kat {
    private int visina;
    private int redniBroj;
    private static List<Prostorija> prostorije;

    public Kat() {
    }

    public Kat(int visina, int redniBroj) {
        this.visina = visina;
        this.redniBroj = redniBroj;
    }
    

    public int getVisina() {
        return visina;
    }

    public void setVisina(int visina) {
        this.visina = visina;
    }

    public int getRedniBroj() {
        return redniBroj;
    }

    public void setRedniBroj(int redniBroj) {
        this.redniBroj = redniBroj;
    }

    public List<Prostorija> getProstorije() {
        return prostorije;
    }

    public void dodajProstoriju(Prostorija prostorija) {
        this.prostorije.add(prostorija);
    }
    
}
