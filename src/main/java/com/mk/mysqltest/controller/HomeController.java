package com.mk.mysqltest.controller;

import com.mk.mysqltest.domain.MySqlLang;
import com.mk.mysqltest.repo.MySqlRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = "application/json")
public class HomeController {

    private MySqlRepo mySqlRepo;
@Autowired
    public HomeController(MySqlRepo mySqlRepo) {
        this.mySqlRepo=mySqlRepo;
    }


    @GetMapping("/sql")
    public Iterable<MySqlLang>getAllByMySqlLang(){
return mySqlRepo.findAll();
    }

}
