package com.niit.FurnitureApp.controller;

import com.niit.FurnitureApp.model.Furniture;
import com.niit.FurnitureApp.service.IFurnitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@CrossOrigin(origins = "http://localhost:4200")//client side url
public class FurnitureController {
    private IFurnitureService furnitureService;

    @Autowired
    public FurnitureController(IFurnitureService furnitureService) {
        this.furnitureService = furnitureService;
    }
    @GetMapping("/allfurnitures")
    public ResponseEntity<?> getAllFurniture(){
        return new ResponseEntity<>(furnitureService.getAllFurniture(), HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<?> saveFurniture(@RequestBody Furniture furniture){
        return new ResponseEntity<>(furnitureService.saveProduct(furniture),HttpStatus.OK);
    }
    @PutMapping("/update/{title}")
    public ResponseEntity<?> updateFurniture(@RequestBody Furniture furniture,@PathVariable String title){
        return new ResponseEntity<>(furnitureService.update(furniture,title),HttpStatus.OK);
    }
    @DeleteMapping("/delete/{title}")
    public ResponseEntity<?> deleteFurniture(@PathVariable String title){
        return new ResponseEntity<>(furnitureService.deleteFurniture(title),HttpStatus.OK);
    }
}
