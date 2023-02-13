package com.niit.FurnitureApp.service;

import com.niit.FurnitureApp.model.Furniture;

import java.util.List;

public interface IFurnitureService {
    public List<Furniture> getAllFurniture();
    public Furniture saveProduct(Furniture furniture);
    public List<Furniture> update(Furniture furniture,String title);
    public String deleteFurniture(String title);
}
