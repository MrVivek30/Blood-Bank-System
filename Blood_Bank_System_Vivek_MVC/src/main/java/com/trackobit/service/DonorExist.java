package com.trackobit.service;

import com.trackobit.dao.BloodBank;
import com.trackobit.model.Donor;

import java.time.LocalDateTime;
import java.util.List;

public class DonorExist {

    public static boolean isExist(int id, LocalDateTime dateTime){

        boolean flag=true;
        List<Donor>donorList= BloodBank.getAllDonors();

        for (Donor d:donorList) {
            if (d.getId() == id) {
                LocalDateTime old = d.getLocalDateTime().plusDays(56);
                if (!dateTime.isAfter(old)){
                    flag=false;
                    break;
                }

            }
        }
        return flag;
    }
}
