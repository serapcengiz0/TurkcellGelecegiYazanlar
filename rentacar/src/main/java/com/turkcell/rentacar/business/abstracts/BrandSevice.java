package com.turkcell.rentacar.business.abstracts;

import com.turkcell.rentacar.entities.concretes.Brand;

import java.util.List;

public interface BrandSevice {
    Brand add(Brand brand);
    Brand update(int id,Brand brand);
    void delete(int id);
    List<Brand> getAll();
    Brand getById(int id);
}
