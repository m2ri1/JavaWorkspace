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
/*    @Transactional
    public ResponseDto create(RequestDto requestDto) {
        CrudEntity crudEntity = new CrudEntity(requestDto);
        crudRepository.save(crudEntity);
        return ResponseDto.toDto(crudEntity);
    }*/

    public ResponseDto read(Integer id) {
        CrudEntity crudEntity = crudRepository.findById(id).orElseThrow(() -> new RuntimeException());
        return ResponseDto.toDto(crudEntity);
    }

/*
    @Transactional
    public Integer update(Integer id, RequestDto requestDto) {
        CrudEntity crudEntity = crudRepository.findById(id).orElseThrow(
                () -> new RuntimeException());
        crudEntity.updateCrudEntity(requestDto);
        return crudEntity.getId();
    }
*/

    @Transactional
    public Integer delete(Integer id) {
        crudRepository.deleteById(id);
        return id;
    }

}
