/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vjezba_builder_kuca;

import builder.Prostorija;
import builder.ProstorijaBuildDirektor;
import builder.ProstorijaBuildImpl;
import java.util.Arrays;

/**
 *
 * @author ivale
 */
public class Vjezba_builder_kuca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProstorijaBuildImpl prostorijaBuilder = new ProstorijaBuildImpl();
        ProstorijaBuildDirektor prostorijaDirektor = new ProstorijaBuildDirektor(prostorijaBuilder);
        Prostorija dnevniBoravak = prostorijaDirektor.izgradiDnevniBoravak();
        Prostorija toalet = prostorijaDirektor.izgradiToalet();
        Prostorija kuhinja = prostorijaDirektor.izgradiKuhinju();
        String[] namjestajSpavSobe={"ormar","krevet", "ormar"};
        Prostorija spavaca = new ProstorijaBuildImpl()
                .setBojaZidova("siva")
                .setBrojProzora(5)
                .setBrojVrata(1)
                .setDuljina(4)
                .setSirina(4)
                .setNaziv("spavaca soba")
                .setNamjestaj(namjestajSpavSobe)
                .build();
        
        System.out.println(Arrays.toString(kuhinja.getNamjestaj())+"   "+Arrays.toString(spavaca.getNamjestaj())
        +"   "+Arrays.toString(toalet.getNamjestaj())+"   "+Arrays.toString(dnevniBoravak.getNamjestaj()));
    }

}
