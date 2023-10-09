package com.trackobit;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Receiver {
    private int enterDonorId;
    private String name;
    private LocalDateTime localDateTime;
    private String address;

    private int unit;

    public Receiver() {
    }

    public Receiver(int enterDonorId, String name, LocalDateTime localDateTime, String address, int unit) {
        this.enterDonorId = enterDonorId;
        this.name = name;
        this.localDateTime = localDateTime;
        this.address = address;
        this.unit = unit;
    }

    public int getEnterDonorId() {
        return enterDonorId;
    }

    public void setEnterDonorId(int enterDonorId) {
        this.enterDonorId = enterDonorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Receiver{" +
                "enterDonorId=" + enterDonorId +
                ", name='" + name + '\'' +
                ", localDateTime=" + localDateTime +
                ", address='" + address + '\'' +
                ", unit=" + unit +
                '}';
    }
}
