package com.qrscanner.app.demo.models.services;

import java.util.List;

import com.qrscanner.app.demo.models.entity.Cupon;

public interface ICuponService {
    public List<Cupon> getCupones();

    public Cupon findById(Long Id);

    public void save(Cupon cupon);
}
