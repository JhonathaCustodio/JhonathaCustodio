package br.com.ibm.welcomeboard.controller;

import br.com.ibm.welcomeboard.domain.dto.WelcomeBoardDto;
import br.com.ibm.welcomeboard.service.WelcomeBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/welcome")
public class WelcomeBoardController {

    @Autowired
    private WelcomeBoardService service;

    @PostMapping
    public ResponseEntity<WelcomeBoardDto> insert(@RequestBody WelcomeBoardDto welcomeBoardDto){
        return new ResponseEntity<>(this.service.insertUser(welcomeBoardDto), CREATED);
    }
}