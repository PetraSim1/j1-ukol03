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
            System.out.println ("Počítač se vypnul.");
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

    @Override
    public String toString() {
        return "Počítač: " + cpu + ram + disk;
    }
}
