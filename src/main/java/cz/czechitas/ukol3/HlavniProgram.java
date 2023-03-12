package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {

        Disk mujDisk = new Disk();
        mujDisk.setKapacita(500_000_000_000L);

        Pamet mojePamet = new Pamet();
        mojePamet.setKapacita(12_000_000_000L);

        Procesor mujProcesor = new Procesor();
        mujProcesor.setRychlost(3_000_000_000_000L);
        mujProcesor.setVyrobce("Intel");

        Pocitac mujPocitac = new Pocitac();
        mujPocitac.setDisk(mujDisk);
        mujPocitac.setRam(mojePamet);
        mujPocitac.setCpu(mujProcesor);

        mujPocitac.zapniSe();

        System.out.println(mujDisk);

        mujPocitac.vytvorSouborOVelikosti(500_000_000_100L);
        System.out.println(mujDisk);

        mujPocitac.vytvorSouborOVelikosti(100L);
        System.out.println(mujDisk);

        mujPocitac.vymazSouborOVelikosti(50L);
        System.out.println(mujDisk);

        mujPocitac.vymazSouborOVelikosti(500_000_000_500L);
        System.out.println(mujDisk);

        mujPocitac.vypniSe();

        mujPocitac.vytvorSouborOVelikosti(100L);

    }
}
