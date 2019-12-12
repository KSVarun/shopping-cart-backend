package com.hacker.foodOrder.beans;

import javax.persistence.*;

@Entity
@Table(name="Menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Long id;
    @Column(name="ItemName")
    private String itemName;
    private String startTimeMorning;
    private String endTimeMorning;
    private String startTimeEvening;
    private String endTimeEvening;
    private String price;

    public Menu() {
    }

    public Menu(Long id, String itemName, String startTimeMorning, String endTimeMorning, String startTimeEvening, String endTimeEvening, String price) {
        this.id = id;
        this.itemName = itemName;
        this.startTimeMorning = startTimeMorning;
        this.endTimeMorning = endTimeMorning;
        this.startTimeEvening = startTimeEvening;
        this.endTimeEvening = endTimeEvening;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getStartTimeMorning() {
        return startTimeMorning;
    }

    public void setStartTimeMorning(String startTimeMorning) {
        this.startTimeMorning = startTimeMorning;
    }

    public String getEndTimeMorning() {
        return endTimeMorning;
    }

    public void setEndTimeMorning(String endTimeMorning) {
        this.endTimeMorning = endTimeMorning;
    }

    public String getStartTimeEvening() {
        return startTimeEvening;
    }

    public void setStartTimeEvening(String startTimeEvening) {
        this.startTimeEvening = startTimeEvening;
    }

    public String getEndTimeEvening() {
        return endTimeEvening;
    }

    public void setEndTimeEvening(String endTimeEvening) {
        this.endTimeEvening = endTimeEvening;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", startTimeMorning='" + startTimeMorning + '\'' +
                ", endTimeMorning='" + endTimeMorning + '\'' +
                ", startTimeEvening='" + startTimeEvening + '\'' +
                ", endTimeEvening='" + endTimeEvening + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
