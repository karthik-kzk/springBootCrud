package com.example.demo.service;

import com.example.demo.entity.Detail;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DetailService {

    Detail createDetail(Detail detail);

//    Detail updateDetail();
//
//
//
    List<Detail> getDetail();
//
//    void deleteDetail();
}
