package com.trackobit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BloodBank {
    private static List<Donor> donorList = new ArrayList<>();
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
    public static Donor getDonorById(int index) {
        Donor donor = donorList.get(index);
        return donor;
 //        int unitsAvailable = donor.getUnit();
//        if (unitsAvailable >= unitsNeeded) {
////            donorList.get(index).getUnit() = unitsAvailable - unitsNeeded;
////            unitsAvailable=unitsAvailable-unitsNeeded;
//
//            donor.setUnit(donor.getUnit()-unitsNeeded);
//        }else{
//            System.out.println("Unit Exceeds.............");
//        }
    }

//    public static void main(String[] args) {
////        donorList.add(new Donor(1,"vivel",23,"o+",2, LocalDate.now(),"bast"));
////        donorList.add(new Donor(1,"vivel",23,"o+",2, LocalDate.now(),"bast"));
////        donorList.add(new Donor(1,"vivel",23,"o+",2, LocalDate.now(),"bast"));
////        System.out.println(donorList);
//        BloodBank.addDonor(new Donor(1,"vivel",23,"o+",2, LocalDateTime.now(),"bast"));
//        BloodBank.addDonor(new Donor(1,"vivel",23,"o+",2, LocalDateTime.now(),"bast"));
//        BloodBank.addDonor(new Donor(1,"vivel",23,"o+",2, LocalDateTime.now(),"bast"));
//        System.out.println(BloodBank.getAllDonors());

//    }
//   public static int findId;
//public static void setId(int i){
//        findId=i;
//    System.out.println("Setting id in findId" +findId);
//
//}

}
