package br.com.ibm.welcomeboard.domain.converter;

import br.com.ibm.welcomeboard.domain.dto.WelcomeBoardDto;
import br.com.ibm.welcomeboard.entity.WelcomeBoardEntity;

import java.util.Optional;

public class WelcomeBoardConverter {

    public WelcomeBoardConverter() {
    }

    public static WelcomeBoardEntity toEntity(Optional<WelcomeBoardDto> dto){

        if(dto.isPresent()){
            return new WelcomeBoardEntity(dto.get().getId(), dto.get().getName(), dto.get().getEmail(), dto.get().getPassword());
        }else{
            throw new IllegalArgumentException("User's info cannot be null");
        }

    }

    public static WelcomeBoardDto toDto(Optional<WelcomeBoardEntity> entity){

        if(entity.isPresent()){
            return new WelcomeBoardDto(entity.get().getId(), entity.get().getName(), entity.get().getEmail(), entity.get().getPassword());
        }else{
            throw new IllegalArgumentException("User's info cannot be null");
        }
    }
}