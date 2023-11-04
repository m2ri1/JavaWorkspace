package com.example.core.service;

import com.example.core.dto.RequestDto;
import com.example.core.dto.ResponseDto;
import com.example.domain.entity.CrudEntity;
import com.example.domain.repository.CrudRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class CrudService{

    private final CrudRepository crudRepository;
    @Transactional
    public ResponseDto create(RequestDto requestDto) {
        CrudEntity crudEntity = new CrudEntity(requestDto);
        CrudRepository.save(crudEntity);
        return ResponseDto.toDto(crudEntity);
    }

}
