//package com.trackobit.service;
//
//import com.trackobit.model.Donor;
//
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class SortingServiceImpl implements SortingService {
//
//    @Override
//    public List<Donor> getDonorByAge(List<Donor> donors) {
//        bubbleSort(donors, (d1, d2) -> Integer.compare(d1.getAge(), d2.getAge()));
//        return donors;
//    }
//
//    @Override
//    public List<Donor> getDonorByName(List<Donor> donors) {
//        bubbleSort(donors, (d1, d2) -> d1.getName().compareTo(d2.getName()));
//        return donors;
//    }
//
//    @Override
//    public List<Donor> getDonorByBloodType(List<Donor> donors) {
//        bubbleSort(donors, (d1, d2) -> d1.getBloodGroup().compareTo(d2.getBloodGroup()));
//        return donors;
//    }
//
//    @Override
//    public List<Donor> getDonorByAddress(List<Donor> donors) {
//        bubbleSort(donors, (d1, d2) -> d1.getAddress().compareTo(d2.getAddress()));
//        return donors;
//    }
//
//    @Override
//    public List<Donor> getDonorByUnitAvailable(List<Donor> donors) {
//        bubbleSort(donors, (d1, d2) -> Integer.compare(d1.getUnit(), d2.getUnit()));
//        return donors;
//    }
//
//    // Bubble Sort implementation
//    private void bubbleSort(List<Donor> donors, java.util.Comparator<Donor> comparator) {
//        int n = donors.size();
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (comparator.compare(donors.get(j), donors.get(j + 1)) > 0) {
//                    // Swap donors[j] and donors[j + 1]
//                    Donor temp = donors.get(j);
//                    donors.set(j, donors.get(j + 1));
//                    donors.set(j + 1, temp);
//                }
//            }
//        }
//    }
//}
//---------------------------------
//donors.removeIf(i->i.getUnit()==0); dall