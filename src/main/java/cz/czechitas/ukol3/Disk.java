package cz.czechitas.ukol3;

public class Disk {
    private  long kapacita;
    private long vyuziteMisto;


    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }

    @Override
    public String toString() {
        return "Disk = " + "Kapacita: " + kapacita + " b, " + "Využité místo: " + vyuziteMisto + " b, Aktuální kapacita: " + (kapacita - vyuziteMisto);
    }
}
