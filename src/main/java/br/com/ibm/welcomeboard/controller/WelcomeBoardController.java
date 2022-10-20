package br.com.ibm.welcomeboard.controller;

import br.com.ibm.welcomeboard.service.WelcomeBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/welcome")
public class WelcomeBoardController {

    @Autowired
    private WelcomeBoardService service;

}