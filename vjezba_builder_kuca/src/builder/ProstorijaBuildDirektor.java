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
        String[] namjestaj={Namjestaj.dvosjed.name(), Namjestaj.fotelja.name(),
            Namjestaj.trosjed.name(), Namjestaj.komoda.name()};
        String[] elektronika={"televizor"};
        return new ProstorijaBuildImpl()
                .setBojaZidova("zelena")
                .setBrojProzora(3)
                .setBrojVrata(1)
                .setDuljina(3)
                .setSirina(3)
                .setNaziv("dnevni boravak")
                .setNamjestaj(namjestaj)
                .setElektronika(elektronika)
                .build();
    }
    
    public Prostorija izgradiKuhinju(){
        String[] namjestaj = {Namjestaj.stol.name(), Namjestaj.stolice.name(),
            Namjestaj.ormaric.name()};
        String[] sanitarije={Sanitarije.sudoper.name()};
        String[] elektronika = {Elektronika.pecnica.name(), Elektronika.frizider.name(),
            Elektronika.suderica.name(), Elektronika.stednjak.name()};
        return new ProstorijaBuildImpl()
                .setBojaZidova("crvena")
                .setBrojProzora(2)
                .setBrojVrata(1)
                .setDuljina(4)
                .setSirina(4)
                .setNaziv("kuhinja")
                .setNamjestaj(namjestaj)
                .setElektronika(elektronika)
                .setSanitarije(sanitarije)
                .build();
    }
    
    public Prostorija izgradiToalet(){
        String[] namjestaj = {Namjestaj.ormaric.name()};
        String[] sanitarije = {Sanitarije.skoljka.name(), Sanitarije.umivaonik.name(),
            Sanitarije.bide.name(), Sanitarije.tusKabina.name()};
        return new ProstorijaBuildImpl()
                .setBojaZidova("plava")
                .setBrojProzora(1)
                .setBrojVrata(1)
                .setDuljina(3)
                .setSirina(2)
                .setNaziv("toalet")
                .setNamjestaj(namjestaj)
                .setSanitarije(sanitarije)
                .build();
    }
    
    
}
