package com.trackobit.service;

import com.trackobit.exception.BloodBankException;
import com.trackobit.model.Donor;

import javax.servlet.http.HttpServlet;
import java.util.List;

public class ServiceImpl extends HttpServlet implements Service{

    @Override
    public List<Donor> getDonorByAge(int age) throws BloodBankException {
        return null;
    }

    @Override
    public List<Donor> getDonorByName(String name) throws BloodBankException {
        return null;
    }

    @Override
    public List<Donor> getDonorByBloodType(String BloodType) throws BloodBankException {
        return null;
    }

    @Override
    public List<Donor> getDonorByAddress(String address) throws BloodBankException {
        return null;
    }

    @Override
    public List<Donor> getDonorByUnitAvailable(String name) throws BloodBankException {
        return null;
    }



}
