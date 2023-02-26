package com.app.blooddonor.Controller;

import com.app.blooddonor.Service.DonorService;
import com.app.blooddonor.Entity.Donor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DonorController {
    @Autowired
    private DonorService ds;

    @RequestMapping("/donor/all")
    public List<Donor> getAll() {
        return ds.getAll();
    }

    @GetMapping("/donor/search/{ID}")
    public Optional<Donor> getDonorById(@PathVariable("ID") int id){
        return ds.getDonorByID(id);
    }

    @GetMapping("/donor/searchByCity/{CityName}")
    public List<Donor> getDonorsByCity(@PathVariable("CityName") String city){
        return ds.getDonorsByCity(city);
    }

    @GetMapping("/donor/searchByMobile/{mobileNo}")
    public List<Donor> getDonorsByMobile(@PathVariable("mobileNo") String mobile){
        return ds.getDonorsByMobile(mobile);
    }

    @GetMapping("/donor/searchByGroup/{bloodGroup}")
    public List<Donor> getDonorsByBloodGroup(@PathVariable("bloodGroup") String bloodGroup){
        return ds.getDonorsByGroup(bloodGroup);
    }

    @PostMapping("/donor/add")
    public Donor createDonor(@RequestBody Donor donor){
        return ds.saveDonor(donor);
    }

    @PutMapping("/donor/update/{id}")
    public void updateDonor(@PathVariable("id") int id, @RequestBody Donor donor){
        ds.updateDonorById(donor,id);
    }

    @DeleteMapping("/donor/delete/{id}")
    public void deleteDonor(@PathVariable("id") int id){
        ds.deleteADonor(id);
    }

}
