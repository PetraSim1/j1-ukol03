package cz.czechitas.ukol3;

import java.util.Objects;

public class Pocitac {

    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk disk;


    public boolean isJeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (!jeZapnuty) {
            kontrolaCasti();
        } else {
            System.err.println("Počítač je už zapnutý, nelze spustit znovu");
        }
    }

    private void kontrolaCasti() {
        if (disk != null && ram != null && cpu != null) {
            jeZapnuty = true;
            System.out.println("Počítač se zapnul.");
        } else {
            System.err.println("Chybí nějaká součást!");
        }
    }

    public void vypniSe() {
        if (jeZapnuty) {
            jeZapnuty = false;
            System.out.println("Počítač se vypnul.");
        }
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public void vytvorSouborOVelikosti (long velikost) {
        if (jeZapnuty) {
            if (disk.getVyuziteMisto() + velikost > disk.getKapacita()) {
                System.err.println("Soubor je příliš velký.");
            } else {
                disk.setVyuziteMisto(disk.getVyuziteMisto() + velikost);
                System.out.println("Vytvořen soubor o velikosti: " + velikost + " b.");
            }
        }
        else {
            System.err.println("Počítač není zapnutý.");
        }
    }

    public void vymazSouborOVelikosti (long velikost) {
        if (jeZapnuty) {
            if (disk.getVyuziteMisto() - velikost < 0) {
                System.err.println("Soubor nelze smazat.");
            } else {
                disk.setVyuziteMisto(disk.getVyuziteMisto() - velikost);
                System.out.println("Smazán soubor o velikosti: " + velikost + " b.");
            }
        }
        else {
            System.err.println("Počítač není zapnutý.");
        }
    }

    @Override
    public String toString() {
        return "Počítač: " + cpu + ram + disk;
    }
}

