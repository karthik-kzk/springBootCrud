package com.example.demo.service.Impl;

import com.example.demo.entity.Detail;
import com.example.demo.repository.DetailRepository;
import com.example.demo.service.DetailService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public  class DetailServiceImpl implements DetailService {

    @Autowired
    private DetailRepository detailQuery;

    @Override
    public Detail createDetail(Detail detail){
        return detailQuery.save(detail);
    }

    @Override
    public List<Detail> getDetail(){
        return detailQuery.findAll();
    }

}
