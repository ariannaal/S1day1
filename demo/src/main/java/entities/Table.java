package entities;

import enums.StatoTavolo;

public class Table {

    private int nTavolo;
    private int maxSeats;
    private StatoTavolo stato;

    public Table(int nTavolo, int maxSeats, StatoTavolo stato) {
        this.nTavolo = nTavolo;
        this.maxSeats = maxSeats;
        this.stato = StatoTavolo.LIBERO;
    }

    public int getnTavolo() {
        return nTavolo;
    }

    public void setnTavolo(int nTavolo) {
        this.nTavolo = nTavolo;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public StatoTavolo getStato() {
        return stato;
    }

    public void setStato(StatoTavolo stato) {
        this.stato = stato;
    }
}
