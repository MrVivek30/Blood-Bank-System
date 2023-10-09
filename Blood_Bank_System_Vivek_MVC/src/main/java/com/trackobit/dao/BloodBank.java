package com.trackobit.dao;

import com.trackobit.model.Donor;
import com.trackobit.model.Receiver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class BloodBank {
    private static List<Donor> donorList = new CopyOnWriteArrayList<>();
    private static List<Receiver> receiverList = new ArrayList<>();

    public static void addDonor(Donor donor) {
        donorList.add(donor);
    }

    public static List<Donor> getAllDonors() {
        return new ArrayList<>(donorList);

    }

    public static void addReceiver(Receiver receiver) {
        receiverList.add(receiver);
    }

    public static List<Receiver> getAllReceivers() {
        return new ArrayList<>(receiverList);
    }
    public static Donor getDonorById(int id) {

      for (Donor d:donorList) {
          if (d.getId() == id) return d;

      }
      return null;
    }
public static void main(String[] args) {
    System.out.println(getAllDonors());
}
}
