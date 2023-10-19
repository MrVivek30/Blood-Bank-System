package com.trackobit.model;

import com.trackobit.exception.BloodBankException;

import java.time.LocalDateTime;
import java.util.Arrays;

public class DonorDTO {

    private int id;
    private String name;
    private int age;
    private String bloodGroup;
    private int unit;
    private LocalDateTime localDateTime;

    private String address;
private int count;
    public DonorDTO() {
    }

    public DonorDTO(int id, String name, int age, String bloodGroup, int unit, LocalDateTime localDateTime, String address,int count) {
        this.id = id;
       setName(name);
        setAge(age);
        setBloodGroup(bloodGroup);
        setUnit(unit);
        this.localDateTime = localDateTime;
        this.address = address;
        this.count=count;
    }

    public int getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.matches("[a-zA-Z]+")) {
            this.name = name;
        } else {
            throw new BloodBankException("Invalid name. Name must contain only alphabets letters (a-z).");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18 && age < 120) {
            this.age = age;
        } else {
            throw new BloodBankException("Invalid age. Age must be between 18 and 120.");
        }
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        String[] validBloodGroups = {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-","a-","a+","b+","b-","ab-","ab+","o-","o+"};
        if (Arrays.asList(validBloodGroups).contains(bloodGroup)) {
            this.bloodGroup = bloodGroup;
        } else {
            throw new BloodBankException("Invalid blood group.");
        }
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        if (unit >= 0) {
            this.unit = unit;
        } else {

            throw new BloodBankException("Invalid unit value. Unit must be a positive number.");
        }
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

    @Override
    public String toString() {
        return "Donor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", unit=" + unit +
                ", localDateTime=" + localDateTime +
                ", address='" + address + '\'' +
                '}';
    }
}
