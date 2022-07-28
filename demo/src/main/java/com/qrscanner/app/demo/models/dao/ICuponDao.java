package com.qrscanner.app.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.qrscanner.app.demo.models.entity.Cupon;

public interface ICuponDao extends CrudRepository<Cupon, Long>{
    
}
