/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.List;

// TO DO: zelim napraviti random izgradnju kuce sa random prostorijama-- ne mora
//bit normalno, moze bit smjesno nesto tipa 4 wc-a 
/**
 *
 * @author ivale
 */
public class Kuca {
    private static List<Kat> katovi;
    
    private boolean bazenDvoriste;
    private boolean garazaDvoriste;
    
    private int brojVrata;
    private int  brojProzora;
    
    private double sirina;
    private double duljina;
    private double visina;
    
    private String bojaFasade;
    private String vrstaKrova;

    public Kuca() {
    }

    public List<Kat> getKatovi() {
        return katovi;
    }

    public void dodajKat(Kat kat) {
        katovi.add(kat);
    }

    public boolean isBazenDvoriste() {
        return bazenDvoriste;
    }

    public void setBazenDvoriste(boolean bazenDvoriste) {
        this.bazenDvoriste = bazenDvoriste;
    }

    public boolean isGarazaDvoriste() {
        return garazaDvoriste;
    }

    public void setGarazaDvoriste(boolean garazaDvoriste) {
        this.garazaDvoriste = garazaDvoriste;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    public int getBrojProzora() {
        return brojProzora;
    }

    public void setBrojProzora(int brojProzora) {
        this.brojProzora = brojProzora;
    }

    public double getSirina() {
        return sirina;
    }

    public void setSirina(double sirina) {
        this.sirina = sirina;
    }

    public double getDuzina() {
        return duljina;
    }

    public void setDuzina(double duzina) {
        this.duljina = duzina;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    public String getBojaFasade() {
        return bojaFasade;
    }

    public void setBojaFasade(String bojaFasade) {
        this.bojaFasade = bojaFasade;
    }

    public String getVrstaKrova() {
        return vrstaKrova;
    }

    public void setVrstaKrova(String vrstaKrova) {
        this.vrstaKrova = vrstaKrova;
    }
    
    
}
