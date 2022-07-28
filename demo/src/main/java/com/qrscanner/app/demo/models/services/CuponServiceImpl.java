package com.qrscanner.app.demo.models.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qrscanner.app.demo.models.dao.ICuponDao;
import com.qrscanner.app.demo.models.entity.Cupon;

@Service
public class CuponServiceImpl implements ICuponService{

    Cupon cupon;

    @Autowired
    private ICuponDao cuponDao;

    @Override
    public List<Cupon> getCupones() {
        
        return (List<Cupon>) cuponDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cupon findById(Long id) {
        return cuponDao.findById(id).orElse(null);
    }

    @Override
    public void save(Cupon cupon) {
        cuponDao.save(cupon);        
    }
    
}
