package com.bwardweb.oh_my_cod.model;

import lombok.Data;

@Data
public class Fish {
    private long id;
    private String name;

    public Fish(long id, String name){
        this.id = id;
        this.name = name;
    }
}
