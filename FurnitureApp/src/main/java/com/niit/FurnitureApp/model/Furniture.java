package com.niit.FurnitureApp.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Document
public class Furniture {
    @Id
    private String title;
    private String desc;
    private String price;
}
