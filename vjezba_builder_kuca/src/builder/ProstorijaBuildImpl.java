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
public class ProstorijaBuildImpl implements ProstorijaBuilder {

    private final Prostorija prostorija;

    public ProstorijaBuildImpl() {
        this.prostorija = new Prostorija();
    }

    @Override
    public Prostorija build() {
        return prostorija;
    }

    /**
     *
     * @param naziv
     * @return
     */
    @Override
    public ProstorijaBuilder setNaziv(String naziv) {
        prostorija.setNaziv(naziv);
        return this;
    }

    /**
     *
     * @param sirina
     * @return
     */
    @Override
    public ProstorijaBuilder setSirina(double sirina) {
        prostorija.setSirina(sirina);
        return this;
    }

    /**
     *
     * @param duljina
     * @return
     */
    @Override
    public ProstorijaBuilder setDuljina(double duljina) {
        prostorija.setDuljina(duljina);
        return this;
    }

    /**
     *
     * @param brojProzora
     * @return
     */
    @Override
    public ProstorijaBuilder setBrojProzora(int brojProzora) {
        prostorija.setBrojProzora(brojProzora);
        return this;
    }

    /**
     *
     * @param brojVrata
     * @return
     */
    @Override
    public ProstorijaBuilder setBrojVrata(int brojVrata) {
        prostorija.setBrojVrata(brojVrata);
        return this;
    }

    /**
     *
     * @param postoje
     * @return
     */
    @Override
    public ProstorijaBuilder setStepenice(boolean postoje) {
        prostorija.setStepenice(postoje);
        return this;
    }

    /**
     *
     * @param bojaZidova
     * @return
     */
    @Override
    public ProstorijaBuilder setBojaZidova(String bojaZidova) {
        prostorija.setBojaZidova(bojaZidova);
        return this;
    }

    /**
     *
     * @param namjestaj
     * @return
     */
    @Override
    public ProstorijaBuilder setNamjestaj(String[] namjestaj) {
        prostorija.setNamjestaj(namjestaj);
        return this;
    }

    @Override
    public ProstorijaBuilder setElektronika(String[] elektronika) {
        prostorija.setElektronika(elektronika);
        return this;
    }

    @Override
    public ProstorijaBuilder setSanitarije(String[] sanitarije) {
        prostorija.setSanitarije(sanitarije);
        return this;
    }

}
