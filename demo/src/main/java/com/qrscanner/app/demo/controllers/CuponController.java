package com.qrscanner.app.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.qrscanner.app.demo.models.entity.Cupon;
import com.qrscanner.app.demo.models.services.ICuponService;

@Controller
public class CuponController {
    @Autowired
    private ICuponService cuponService;

    @GetMapping("cupones")
    public String getCupons(Model model) {
        model.addAttribute("cupones", cuponService.getCupones());
        return "index";
    }

    @PostMapping("/")
    public String save(Long placa){
        Cupon cuponAux = cuponService.findById(placa);
        Cupon cupon = new Cupon();
        cupon.setPlaca(placa);
        cupon.setCity("Medellín");
        cupon.setPerson("yo");
        cupon.setDescuento("50");

        if(cuponAux == null){
            cuponService.save(cupon);
            return "index";
        }else{
            return "no";
        }
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }
    // @GetMapping("/{id}")
    // public Cupon getCupon(Long placa){
    //     return cuponService.findById(placa);
    // }
}
