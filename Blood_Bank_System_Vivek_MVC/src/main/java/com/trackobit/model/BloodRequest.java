package com.trackobit.model;

import com.trackobit.exception.BloodBankException;

public class BloodRequest {
    private int donorId;
    private String name;
    private String address;
    private int unitsRequested;

    public BloodRequest(int donorId, String name, String address, int unitsRequested) {
        this.donorId = donorId;
        this.name = name;
        this.address = address;
        this.unitsRequested = unitsRequested;
    }

    public int getDonorId() {
        return donorId;
    }

    public void setDonorId(int donorId) {
        if (donorId > 0) {
            this.donorId = donorId;
        } else {
            throw new BloodBankException("Invalid unit value. Unit must be a positive number.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.matches("^[a-zA-Z]*$")) {
            this.name = name;
        } else {
            throw new BloodBankException("Invalid name. Name must contain only alphabetic characters.");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address != null && address.trim().length() > 0) {
            this.address = address;
        } else {
            throw new BloodBankException("Address cannot be empty or null.");
        }
    }

    public int getUnitsRequested() {
        return unitsRequested;
    }

    public void setUnitsRequested(int unitsRequested) {
        if (unitsRequested > 0) {
            this.unitsRequested = unitsRequested;
        } else {
            throw new BloodBankException("Units requested must be a positive integer.");
        }
    }

    @Override
    public String toString() {
        return "BloodRequest{" +
                "donorId=" + donorId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", unitsRequested=" + unitsRequested +
                '}';
    }
}
