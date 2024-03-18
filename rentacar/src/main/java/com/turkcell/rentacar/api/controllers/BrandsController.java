package com.turkcell.rentacar.api.controllers;

import com.turkcell.rentacar.business.abstracts.BrandSevice;
import com.turkcell.rentacar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //anotation,erişim noktası
@AllArgsConstructor
@RequestMapping("api/v1/brands")//turkcell.com.tr./xproject/api/v1/brands,erişim noktasına bu adres ile erişssin
public class BrandsController {
    private BrandSevice brandService;
    @PostMapping//(Post yapınca sen çalış)
    @ResponseStatus(HttpStatus.CREATED)
    public Brand add(@RequestBody Brand brand){
        return brandService.add(brand);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Brand update(@PathVariable int id,@RequestBody Brand brand){
        return brandService.update(id,brand);
    }

    @DeleteMapping("/id")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable int id){
        brandService.delete(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Brand> getAll(){
        return brandService.getAll();
    }

    @GetMapping("/id")
    public Brand getById(@PathVariable int id){
        return brandService.getById(id);
    }
}
