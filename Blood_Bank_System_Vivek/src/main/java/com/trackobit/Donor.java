package com.trackobit;



import java.time.LocalDateTime;

public class Donor {

    private int id;


    private String name;
    private int age;


    private String bloodGroup;
   private int unit;

   private LocalDateTime localDateTime;
   private String address;

    public Donor() {
    }

    public Donor(int id, String name, int age, String bloodGroup, int unit, LocalDateTime localDateTime, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.unit = unit;
        this.localDateTime = localDateTime;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
//        if (bloodGroup=="O+||")
        this.bloodGroup = bloodGroup;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
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
