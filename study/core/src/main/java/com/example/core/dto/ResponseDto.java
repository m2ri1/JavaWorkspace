package com.example.core.dto;

import com.example.domain.entity.CrudEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {
    private Integer id;
    private String message;

    public static ResponseDto toDto(CrudEntity crudEntity) {
        ResponseDto responseDto = new ResponseDto();
        responseDto.id = crudEntity.getId();
        responseDto.message = crudEntity.getMessage();
        return responseDto;
    }
}
