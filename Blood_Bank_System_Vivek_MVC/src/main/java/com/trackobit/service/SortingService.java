package com.trackobit.service;

import com.trackobit.exception.BloodBankException;
import com.trackobit.model.Donor;

import java.util.List;

public interface SortingService {
    public List<Donor> getDonorByAge(List<Donor> donors) throws BloodBankException;
    public List<Donor>getDonorByName(List<Donor> donors) throws BloodBankException;
    public List<Donor>getDonorByBloodType(List<Donor> donors) throws BloodBankException;
    public List<Donor>getDonorByAddress(List<Donor> donors) throws BloodBankException;
    public List<Donor>getDonorByUnitAvailable(List<Donor> donors) throws BloodBankException;
}
