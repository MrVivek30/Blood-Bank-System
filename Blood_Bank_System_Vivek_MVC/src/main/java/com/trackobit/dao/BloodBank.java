package com.trackobit.dao;

import com.trackobit.model.Donor;
import com.trackobit.model.DonorDTO;
import com.trackobit.model.Receiver;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class BloodBank {
    private static List<Donor> donorList = new CopyOnWriteArrayList<>();
    private static List<DonorDTO> donorListPending = new CopyOnWriteArrayList<>();
    private static List<Receiver> receiverList = new ArrayList<>();
    private static List<Receiver> pendingReceiverList = new ArrayList<>();

    //---------------prefilled data for testing purpose-----------------------------------

    static {

        Donor donor=new Donor();
        Donor donor2=new Donor();
        Donor donor3=new Donor();
        Donor donor4=new Donor();
        Donor donor5=new Donor();
        donor.setId(1);
        donor.setName("vivek");
        donor.setUnit(3);
        donor.setBloodGroup("O+");
        donor.setAddress("basti");
        donor.setAge(23);
        donor.setLocalDateTime(LocalDateTime.now());

        donor2.setId(2);
        donor2.setName("kamlesh");
        donor2.setUnit(2);
        donor2.setBloodGroup("A+");
        donor2.setAddress("ranchi");
        donor2.setAge(25);
        donor2.setLocalDateTime(LocalDateTime.now());

        donor3.setId(3);
        donor3.setName("shalu");
        donor3.setUnit(3);
        donor3.setBloodGroup("B+");
        donor3.setAddress("lucknow");
        donor3.setAge(22);
        donor3.setLocalDateTime(LocalDateTime.now());

        donor4.setId(4);
        donor4.setName("ramu");
        donor4.setUnit(4);
        donor4.setBloodGroup("O-");
        donor4.setAddress("mumbai");
        donor4.setAge(28);
        donor4.setLocalDateTime(LocalDateTime.now());

        donor5.setId(5);
        donor5.setName("Ankush");
        donor5.setUnit(3);
        donor5.setBloodGroup("O+");
        donor5.setAddress("patna");
        donor5.setAge(23);
        donor5.setLocalDateTime(LocalDateTime.now());


        donorList.add(donor);
        donorList.add(donor2);
        donorList.add(donor3);
        donorList.add(donor4);
        donorList.add(donor5);

    }


    public static void addDonor(Donor donor) {
        donorList.add(donor);
    }
    public static void addDonorPending(DonorDTO donor) {
        donorListPending.add(donor);
    }

    public static List<Donor> getAllDonors() {
        return new ArrayList<>(donorList);

    }  public static List<DonorDTO> getAllDonorsPending() {
        return new ArrayList<>(donorListPending);

    }

    public static void addReceiver(Receiver receiver) {
        receiverList.add(receiver);
    }
    public static void addReceiverPending(Receiver receiver) {
        pendingReceiverList.add(receiver);
    }

    public static List<Receiver> getAllReceivers() {
        return new ArrayList<>(receiverList);
    }
    public static List<Receiver> getAllPendingReceivers() {
        return new ArrayList<>(pendingReceiverList);
    }
    public static Donor getDonorById(int id) {

      for (Donor d:donorList) {
          if (d.getId() == id) return d;

      }
      return null;
    }  public static DonorDTO getDonorPendingById(int id) {

      for (DonorDTO d:donorListPending) {
          if (d.getId() == id) return d;

      }
      return null;
    }
public static void main(String[] args) {
    System.out.println(getAllDonors());
}
}
