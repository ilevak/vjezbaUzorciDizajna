/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;


//TO DO: želim napravit metode koje random izabiru od namjestaja i rade prostorije,
//sad je problem sto imamo razlicite vrste namjestaja za razlicite prostorije,pa 
//onda treba razmislit kako to napravit
/**
 *
 * @author ivale
 */
public class ProstorijaBuildDirektor {
    private ProstorijaBuilder prostorijaBuilder;

    public ProstorijaBuildDirektor(ProstorijaBuilder prostorijaBuilder) {
        this.prostorijaBuilder = prostorijaBuilder;
    }
    
    public Prostorija izgradiDnevniBoravak(){
        String[] namjestaj={"fotelja", "dvosjed", "stolic", "komoda"};
        String[] elektronika={"televizor"};
        return new ProstorijaBuildImpl()
                .setBojaZidova("plava")
                .setBrojProzora(0)
                .setBrojVrata(0)
                .setDuljina(0)
                .setSirina(0)
                .setNaziv("dnevni boravak")
                .setNamjestaj(namjestaj)
                .setElektronika(elektronika)
                .build();
    }
    
    public Prostorija izgradiKuhinju(){
        String[] namjestaj = {"stol", "stolica", "ormarici", "sudoper"};
        String[] elektronika = {"pecnica", "frizider", "suderica", "stednjak"};
        return new ProstorijaBuildImpl()
                .setBojaZidova("plava")
                .setBrojProzora(0)
                .setBrojVrata(0)
                .setDuljina(0)
                .setSirina(0)
                .setNaziv("dnevni boravak")
                .setNamjestaj(namjestaj)
                .setElektronika(elektronika)
                .build();
    }
    
    public Prostorija izgradiWc(){
        String[] namjestaj = {"ormaric"};
        String[] kupaonskaOprema = {"školjka", "umivaonik", "bide", "tušKabina"};
        return new ProstorijaBuildImpl()
                .setBojaZidova("plava")
                .setBrojProzora(0)
                .setBrojVrata(0)
                .setDuljina(0)
                .setSirina(0)
                .setNaziv("toalet")
                .setNamjestaj(namjestaj)
                .build();
    }
    
    
}
