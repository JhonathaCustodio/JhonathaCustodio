package br.com.ibm.welcomeboard.service;


import br.com.ibm.welcomeboard.domain.converter.WelcomeBoardConverter;
import br.com.ibm.welcomeboard.domain.dto.WelcomeBoardDto;
import br.com.ibm.welcomeboard.entity.WelcomeBoardEntity;
import br.com.ibm.welcomeboard.repository.WelcomeBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class WelcomeBoardService {

    @Autowired
    private WelcomeBoardRepository repository;

    public WelcomeBoardDto insertUser(WelcomeBoardDto welcomeBoardDto) {
        WelcomeBoardEntity welcomeBoardEntity = WelcomeBoardConverter.toEntity(Optional.of(welcomeBoardDto));
        return WelcomeBoardConverter.toDto(Optional.ofNullable(repository.save(welcomeBoardEntity)));
    }

    public List<WelcomeBoardDto> findAll() {
        return repository.findAll().stream().map(e -> WelcomeBoardConverter.toDto(Optional.ofNullable(e))).collect(Collectors.toList());
    }

}