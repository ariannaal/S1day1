package entities;

import enums.StatoOrdine;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private int OrderN;
    private Table table;
    private StatoOrdine statoOrdine;
    private List<Item> orderItems;
    private int nOfSeats;
    private LocalTime orderTime;
    private double totalAmount;

    @Value("$costo.coperto")
    private double coverCharge;

    public Order(int orderN, Table table, StatoOrdine statoOrdine, int nOfSeats, LocalDateTime orderTime) {
        OrderN = orderN;
        this.table = table;
        this.statoOrdine = StatoOrdine.IN_CORSO;
        this.orderItems = new ArrayList<>();
        this.nOfSeats = nOfSeats;
        this.totalAmount = totalAmount;
    }

    private double totalAmount() {
        double itemTotal = 0.0; // parte da 0
        for (Item item : orderItems) { // somma i prezzi dell'ordine
            itemTotal += item.getPrice();
        }
        double totalCoverCharge = nOfSeats * coverCharge; // calcola costo totale dei coperti
        return itemTotal + totalCoverCharge;
    }

    public void addElementoComanda(Item item) {
        orderItems.add(item);
    }

    public int getOrderN() {
        return OrderN;
    }

    public void setOrderN(int orderN) {
        OrderN = orderN;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public StatoOrdine getStatoOrdine() {
        return statoOrdine;
    }

    public void setStatoOrdine(StatoOrdine statoOrdine) {
        this.statoOrdine = statoOrdine;
    }

    public List<Item> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<Item> orderItems) {
        this.orderItems = orderItems;
    }

    public int getnOfSeats() {
        return nOfSeats;
    }

    public void setnOfSeats(int nOfSeats) {
        this.nOfSeats = nOfSeats;
    }

    public LocalTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalTime orderTime) {
        this.orderTime = orderTime;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getCoverCharge() {
        return coverCharge;
    }

    public void setCoverCharge(double coverCharge) {
        this.coverCharge = coverCharge;
    }

    public void stampaOrdine() {
        orderItems.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Order{" +
                "OrderN=" + OrderN +
                ", table=" + table +
                ", statoOrdine=" + statoOrdine +
                ", orderItems=" + orderItems +
                ", nOfSeats=" + nOfSeats +
                ", orderTime=" + orderTime +
                ", totalAmount=" + totalAmount +
                ", coverCharge=" + coverCharge +
                '}';
    }

}
