package com.turkcell.rentacar.business.concretes;

import com.turkcell.rentacar.business.abstracts.BrandSevice;
import com.turkcell.rentacar.dataAccess.abstracts.BrandRepository;
import com.turkcell.rentacar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service//Bu sınıf bir business nesenesidir
public class BrandManager implements BrandSevice {
    private BrandRepository brandRepository;
    @Override
    public Brand add(Brand brand) {
        //TODO: BUSİNESS RULES
        Brand createdBrand=brandRepository.save(brand);
        return createdBrand;
    }


    public Brand update(int id,Brand brand) {
        Brand updatedBrand=brandRepository.findById(id).orElse(null);
        if(updatedBrand==null){
            return null;
        }
        updatedBrand.setName(brand.getName());
        return brandRepository.save(updatedBrand);
    }


    public void delete(int id) {

        brandRepository.deleteById(id);
    }


    public List<Brand> getAll() {
        return brandRepository.findAll();
    }

    public Brand getById(int id) {
        return brandRepository.findById(id).orElse(null);
    }
}
