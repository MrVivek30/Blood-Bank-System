//package com.trackobit.service;
//
//import com.trackobit.model.Donor;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class SortingHandler {
//
//    public static List<Donor> sortingDonors(String filterCriteria, List<Donor> donors) {
//        List<Donor> sortingDonors = new ArrayList<>();
//SortingService sortingService = null;
//        for (Donor donor : donors) {
//            if ("name".equals(filterCriteria) ) {
//              sortingService.getDonorByName(donors);
//                sortingDonors.add(donor);
//            } else if ("age".equals(filterCriteria) ) {
//                sortingService.getDonorByAge(donors);
//                sortingDonors.add(donor);
//            } else if ("bloodType".equals(filterCriteria)) {
//                sortingService.getDonorByBloodType(donors);
//                sortingDonors.add(donor);
//            } else if ("address".equals(filterCriteria)) {
//                sortingService.getDonorByAddress(donors);
//                sortingDonors.add(donor);
//            } else if ("bloodUnit".equals(filterCriteria) ) {
//                sortingService.getDonorByUnitAvailable(donors);
//                sortingDonors.add(donor);
//            }
//        }
//
//        return sortingDonors;
//    }
//}
