package com.trackobit.service;

import com.trackobit.model.Donor;

import java.util.ArrayList;
import java.util.List;

public class Filter_DonorService {
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

        return filteredDonors;
    }
}
