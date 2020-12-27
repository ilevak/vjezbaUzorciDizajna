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
interface KucaBuilder {
    Kuca build();
    
    KucaBuilder dodajKatove(List<Kat> katovi);
    
    KucaBuilder setBazenDvoriste(boolean postoji);
    KucaBuilder setGarazaDvoriste(boolean postoji);
    
    KucaBuilder setBrojVrata(int ukupniBrojVrata);
    KucaBuilder setBrojProzora(int ukupniBrojProzora);
    
    KucaBuilder setSirina(int sirina);
    KucaBuilder setVisina(int visina);
    KucaBuilder setDuljina(int duljina);
            
    KucaBuilder setBojaFasade(String boja);
    KucaBuilder setVrstaKrova(String vrsta);
    
    
}
