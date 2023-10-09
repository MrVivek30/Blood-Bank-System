package com.trackobit.service;

import com.trackobit.exception.BloodBankException;
import com.trackobit.model.Donor;

import java.util.List;

public interface Service {

    public List<Donor>getDonorByAge(int age) throws BloodBankException;
    public List<Donor>getDonorByName(String name) throws BloodBankException;
    public List<Donor>getDonorByBloodType(String BloodType) throws BloodBankException;
    public List<Donor>getDonorByAddress(String address) throws BloodBankException;
    public List<Donor>getDonorByUnitAvailable(String name) throws BloodBankException;

}
