package com.trackobit.service;

import com.trackobit.model.Donor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting_DonorService {

    public static List<Donor> sortedDonors(String sortCriteria, List<Donor> donors) {
        List<Donor> sortedDonors = new ArrayList<>();

        // Sort the list based on the selected criteria
        if ("age".equals(sortCriteria)) {
            Collections.sort(donors, Comparator.comparingInt(Donor::getAge));
        } else if ("name".equals(sortCriteria)) {
            Collections.sort(donors, Comparator.comparing(Donor::getName));
        } else if ("bloodType".equals(sortCriteria)) {
            Collections.sort(donors, Comparator.comparing(Donor::getBloodGroup));
        } else if ("address".equals(sortCriteria)) {
//            Collections.sort(donors, Comparator.comparing(Donor::getAddress));
            Collections.sort(donors, Comparator.comparing(Donor::getAddress, String.CASE_INSENSITIVE_ORDER));
        } else if ("bloodUnit".equals(sortCriteria)) {
            Collections.sort(donors, Comparator.comparingInt(Donor::getUnit));
        }

        // Add the sorted donors to the result list
        sortedDonors.addAll(donors);

        return sortedDonors;
    }
}
