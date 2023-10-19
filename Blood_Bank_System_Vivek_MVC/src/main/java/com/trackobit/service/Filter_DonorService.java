//package com.trackobit.service;
//
//import com.trackobit.model.Donor;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Filter_DonorService {
//    public static List<Donor> filterDonors(String filterCriteria, String filterValue, List<Donor> donors) {
//        List<Donor> filteredDonors = new ArrayList<>();
//
//        for (Donor donor : donors) {
//            if ("name".equals(filterCriteria) && donor.getName().equalsIgnoreCase(filterValue)) {
//                filteredDonors.add(donor);
//            } else if ("age".equals(filterCriteria) && String.valueOf(donor.getAge()).equals(filterValue)) {
//                filteredDonors.add(donor);
//            } else if ("bloodType".equals(filterCriteria) && donor.getBloodGroup().equalsIgnoreCase(filterValue)) {
//                filteredDonors.add(donor);
//            } else if ("address".equals(filterCriteria) && donor.getAddress().equalsIgnoreCase(filterValue)) {
//                filteredDonors.add(donor);
//            } else if ("bloodUnit".equals(filterCriteria) && String.valueOf(donor.getUnit()).equals(filterValue)) {
//                filteredDonors.add(donor);
//            }
//        }
//
//        return filteredDonors;
//    }
//}
package com.trackobit.service;

import com.trackobit.model.Donor;

import java.util.ArrayList;
import java.util.List;

public class Filter_DonorService {
    public static List<Donor> filterDonorsRange(String filterCriteria, String filterType, String filterValue, String minValue, String maxValue, List<Donor> donors) {
        donors.removeIf(i->i.getUnit()==0);
        List<Donor> filteredDonors = new ArrayList<>();
//        List<Donor> filteredDonors = donors;

        for (Donor donor : donors) {
            if ("name".equals(filterCriteria) && donor.getName().equalsIgnoreCase(filterValue)) {
                filteredDonors.add(donor);
            } else if ("age".equals(filterCriteria)) {
                int age = donor.getAge();
                if ("exact".equals(filterType) && String.valueOf(age).equals(filterValue)) {
                    filteredDonors.add(donor);
                } else if ("range".equals(filterType)) {
                    int minAge = Integer.parseInt(minValue);
                    int maxAge = Integer.parseInt(maxValue);
                    if (age >= minAge && age <= maxAge) {
                        filteredDonors.add(donor);
                    }
                }
            } else if ("bloodType".equals(filterCriteria) && donor.getBloodGroup().equalsIgnoreCase(filterValue)) {
                filteredDonors.add(donor);
            } else if ("address".equals(filterCriteria) && donor.getAddress().equalsIgnoreCase(filterValue)) {
                filteredDonors.add(donor);
            } else if ("bloodUnit".equals(filterCriteria)) {
                int unit = donor.getUnit();
                if ("exact".equals(filterType) && String.valueOf(unit).equals(filterValue)) {
                    filteredDonors.add(donor);
                } else if ("range".equals(filterType)) {
                    int minUnit = Integer.parseInt(minValue);
                    int maxUnit = Integer.parseInt(maxValue);
                    if (unit >= minUnit && unit <= maxUnit) {
                        filteredDonors.add(donor);
                    }
                }
            }
        }
        filteredDonors.removeIf(i->i.getUnit()==0);
        return filteredDonors;
    }


    //------------m2--------------
    public static List<Donor> filterDonors(String filterCriteria, String filterValue, List<Donor> donors) {
        List<Donor> filteredDonors = new ArrayList<>();

        for (Donor donor : donors) {
            if ("name".equals(filterCriteria) && donor.getName().equalsIgnoreCase(filterValue)) {
                filteredDonors.add(donor);
            } else if ("age".equals(filterCriteria) && String.valueOf(donor.getAge()).equals(filterValue)) {
                filteredDonors.add(donor);
            } else if ("bloodType".equals(filterCriteria) && donor.getBloodGroup().equalsIgnoreCase(filterValue)) {
                filteredDonors.add(donor);
            } else if ("address".equals(filterCriteria) && donor.getAddress().equalsIgnoreCase(filterValue)) {
                filteredDonors.add(donor);
            } else if ("bloodUnit".equals(filterCriteria) && String.valueOf(donor.getUnit()).equals(filterValue)) {
                filteredDonors.add(donor);
            }
        }
        filteredDonors.removeIf(i->i.getUnit()==0);
        return filteredDonors;
    }
}