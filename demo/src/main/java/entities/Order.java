package entities;

import enums.StatoOrdine;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
    private int numeroOrdine;
    private StatoOrdine state;
    private int numCoperti;
    private LocalTime oraAcquisizione;
    private List<Item> orderedProducts;
    private Table table;

    public Order(int numCoperti, Table table) {
        Random rndm = new Random();
        // controllo se il numero di coperti supera il numero massimo di posti al tavolo
        if (table.getNumMaxCoperti() <= numCoperti)
            throw new RuntimeException("Numero coperti maggiore di numero massimo posti sul tavolo!");
        // genera un numero d'ordine casuale
        this.numeroOrdine = rndm.nextInt(1000, 100000);
        // imposta lo stato dell'ordine come in corso
        this.state = StatoOrdine.IN_CORSO;
        this.numCoperti = numCoperti;
        this.oraAcquisizione = LocalTime.now();
        // inizializza la lista dei prodotti ordinati
        this.orderedProducts = new ArrayList<>();
        this.table = table;
    }

    // metodo per aggiungere un item all'ordine
    public void addItem(Item item) {
        this.orderedProducts.add(item);
    }

    // metodo per calcolare il totale dell'ordine
    public double getTotal() {
        return this.orderedProducts.stream().mapToDouble(Item::getPrice).sum() + (this.table.getCostoCoperto() * this.numCoperti);
    }

    // metodo per stampare i dettagli dell'ordine
    public void print() {
        System.out.println("id ordine--> " + this.numeroOrdine);
        System.out.println("stato--> " + this.state);
        System.out.println("numero coperti--> " + this.numCoperti);
        System.out.println("ora acquisizione--> " + this.oraAcquisizione);
        System.out.println("numero tavolo--> " + this.table.getNumTable());
        System.out.println("Lista: ");
        this.orderedProducts.forEach(System.out::println);
        System.out.println("totale--> " + this.getTotal());

    }
}

