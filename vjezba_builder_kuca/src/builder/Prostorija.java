/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author ivale
 */
public class Prostorija {
    
    private String naziv;
    
    private double sirina;
    private double duljina;
    
    private int brojProzora;
    private int brojVrata;
    private boolean stepenice;
    
    
    private String bojaZidova;
    private String[] namjestaj;
    private String[] elektronika;
    private String[] sanitarije;

    public Prostorija() {
    }



    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getSirina() {
        return sirina;
    }

    public void setSirina(double sirina) {
        this.sirina = sirina;
    }


    public double getDuljina() {
        return duljina;
    }

    public void setDuljina(double duljina) {
        this.duljina = duljina;
    }

    public int getBrojProzora() {
        return brojProzora;
    }

    public void setBrojProzora(int brojProzora) {
        this.brojProzora = brojProzora;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    public boolean isStepenice() {
        return stepenice;
    }

    public void setStepenice(boolean stepenice) {
        this.stepenice = stepenice;
    }

    public String getBojaZidova() {
        return bojaZidova;
    }

    public void setBojaZidova(String bojaZidova) {
        this.bojaZidova = bojaZidova;
    }

    public String[] getNamjestaj() {
        return namjestaj;
    }

    public void setNamjestaj(String[] namjestaj) {
        this.namjestaj = namjestaj;
    }

    public String[] getElektronika() {
        return elektronika;
    }

    public void setElektronika(String[] elektronika) {
        this.elektronika = elektronika;
    }

    public String[] getSanitarije() {
        return sanitarije;
    }

    public void setSanitarije(String[] sanitarije) {
        this.sanitarije = sanitarije;
    }



    
    
    
    
}
