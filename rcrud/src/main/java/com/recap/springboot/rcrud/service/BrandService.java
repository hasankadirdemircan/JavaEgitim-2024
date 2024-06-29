package com.recap.springboot.rcrud.service;

import com.recap.springboot.rcrud.model.Brand;
import com.recap.springboot.rcrud.repository.BrandRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandService {

    @Autowired
    private BrandRepository brandRepository;

    public Brand createBrand(Brand brand) {
        return brandRepository.save(brand);
    }

    public List<Brand> getAllBrandList() {
        return brandRepository.findAll();
    }
}
