package com.niit.FurnitureApp.service;

import com.niit.FurnitureApp.model.Furniture;
import com.niit.FurnitureApp.repository.FurnitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class FurnitureImpl implements IFurnitureService{
    @Autowired
    private FurnitureRepository furnitureRepository;
    @Override
    public List<Furniture> getAllFurniture() {
        return furnitureRepository.findAll();
    }

    @Override
    public Furniture saveProduct(Furniture furniture) {
        return furnitureRepository.save(furniture);
    }

    @Override
    public List<Furniture> update(Furniture furniture, String title) {
        Furniture updateFur = furnitureRepository.findById(title).get();
        updateFur.setDesc(furniture.getDesc());
        updateFur.setPrice(furniture.getPrice());
        return Collections.singletonList(furnitureRepository.save(updateFur));
    }

    @Override
    public String deleteFurniture(String title) {
        furnitureRepository.deleteById(title);
        return "product deleted";
    }
}
