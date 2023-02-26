package com.app.blooddonor.Service;

import com.app.blooddonor.Entity.Donor;
import com.app.blooddonor.Repository.DonorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DonorService {
    @Autowired
    private DonorRepository donorRepository;

    public List<Donor> getAll(){
        return donorRepository.findAll();
    }
    public Optional<Donor> getDonorByID(int id){
        return donorRepository.findById(id);
    }
    public List<Donor> getDonorsByCity(String city){
        return donorRepository.findDonorByCity(city);
    }
    public List<Donor> getDonorsByMobile(String mobile){
        return donorRepository.findDonorByMobileNo(mobile);
    }
    public List<Donor> getDonorsByGroup(String blood){
        return donorRepository.findDonorByBloodGroup(blood);
    }
    public Donor saveDonor(Donor donor){
        return donorRepository.save(donor);
    }
    public void updateDonorById(Donor donor,int id){
        donor.setId(id);
        donorRepository.save(donor);
    }
    public void deleteADonor(int id){
        donorRepository.deleteById(id);
    }

}
