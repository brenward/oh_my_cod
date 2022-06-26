package com.bwardweb.oh_my_cod.web.controller.api;

import com.bwardweb.oh_my_cod.model.Fish;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/fish")
public class FishController {

    @RequestMapping(value = "/getFish", method = RequestMethod.GET)
    public Fish getFish(){
        return new Fish(1l, "Cod");
    }

    @GetMapping(value = "/get")
    public Fish getFishTest(){
        return new Fish(1l, "Cod");
    }
}
