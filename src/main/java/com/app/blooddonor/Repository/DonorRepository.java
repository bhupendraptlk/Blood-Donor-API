package com.app.blooddonor.Repository;

import com.app.blooddonor.Entity.Donor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DonorRepository extends JpaRepository<Donor,Integer> {
//    Optional<Donor> findDonorByD_ID(String D_ID);
    List<Donor> findDonorByCity(String D_City);
    List<Donor> findDonorByMobileNo(String mobile);
    List<Donor> findDonorByBloodGroup(String D_Blood_Group);
}
