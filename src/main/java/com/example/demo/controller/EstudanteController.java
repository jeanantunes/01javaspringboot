package com.example.demo.controller;

import com.example.demo.model.Estudante;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("estudantes")
public class EstudanteController {

    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public List<Estudante> listAll() {
        System.out.println("------" + new Date() + "------");
        return asList(new Estudante("Zé"), new Estudante("Juca"));
    }
}
