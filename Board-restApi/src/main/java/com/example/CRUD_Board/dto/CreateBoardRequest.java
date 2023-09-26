package com.example.CRUD_Board.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateBoardRequest {

    @NotNull
    private String title;

    @NotNull
    private String content;

    @NotNull
    private String createdBy;
}
