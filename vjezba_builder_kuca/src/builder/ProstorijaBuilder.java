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
public interface ProstorijaBuilder {

    Prostorija build();

    ProstorijaBuilder setNaziv(String naziv);

    ProstorijaBuilder setSirina(double sirina);

    ProstorijaBuilder setDuljina(double duljina);

    ProstorijaBuilder setBrojProzora(int brojProzora);

    ProstorijaBuilder setBrojVrata(int brojVrata);

    ProstorijaBuilder setStepenice(boolean postoje);

    ProstorijaBuilder setBojaZidova(String bojaZidova);

    ProstorijaBuilder setNamjestaj(String[] namjestaj);
    
    ProstorijaBuilder setElektronika(String[] elektronika);
    
    ProstorijaBuilder setSanitarije(String[] sanitarije);

}
