package com.inventoryService.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "inventory")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String skuCode;

    private Integer quantity;
}
