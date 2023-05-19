package com.example.demo.controller;
import com.example.demo.entity.Detail;
import com.example.demo.service.DetailService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/detail")
@AllArgsConstructor
public class DetailController {


    private DetailService detailService;
    @PostMapping
    public ResponseEntity<Detail> createDetail(@RequestBody Detail detail ){
        System.out.println(detail +"  test");
               Detail data = detailService.createDetail(detail);
        return new ResponseEntity<>(data,HttpStatusCode.valueOf(200));
    }

    @GetMapping
    public ResponseEntity<List<Detail>> getDetail(){
        List<Detail> data = detailService.getDetail();
                return new ResponseEntity<>(data,HttpStatusCode.valueOf(200));
    }
}
