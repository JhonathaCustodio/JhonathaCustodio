package br.com.ibm.welcomeboard.service;


import br.com.ibm.welcomeboard.domain.converter.WelcomeBoardConverter;
import br.com.ibm.welcomeboard.domain.dto.WelcomeBoardDto;
import br.com.ibm.welcomeboard.entity.WelcomeBoardEntity;
import br.com.ibm.welcomeboard.repository.WelcomeBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class WelcomeBoardService {

    @Autowired
    private WelcomeBoardRepository repository;

    public WelcomeBoardDto insertUser(WelcomeBoardDto welcomeBoardDto) {
        WelcomeBoardEntity welcomeBoardEntity = WelcomeBoardConverter.toEntity(Optional.of(welcomeBoardDto));
        return WelcomeBoardConverter.toDto(Optional.ofNullable(repository.save(welcomeBoardEntity)));
    }

}