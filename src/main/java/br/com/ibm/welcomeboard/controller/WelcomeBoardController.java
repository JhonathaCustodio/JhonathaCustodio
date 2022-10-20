package br.com.ibm.welcomeboard.controller;

import br.com.ibm.welcomeboard.domain.dto.WelcomeBoardDto;
import br.com.ibm.welcomeboard.service.WelcomeBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<WelcomeBoardDto>> findAll(){
        return ResponseEntity.ok(this.service.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<WelcomeBoardDto> findById(@PathVariable Long id){
        return ResponseEntity.ok(this.service.findById(id));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<WelcomeBoardDto> update(@PathVariable Long id, @RequestBody WelcomeBoardDto welcomeBoardDto){
        welcomeBoardDto = service.update(id, welcomeBoardDto);
        return ResponseEntity.ok().body(welcomeBoardDto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}