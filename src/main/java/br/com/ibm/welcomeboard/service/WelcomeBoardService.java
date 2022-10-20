package br.com.ibm.welcomeboard.service;


import br.com.ibm.welcomeboard.repository.WelcomeBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WelcomeBoardService {

    @Autowired
    private WelcomeBoardRepository repository;

}