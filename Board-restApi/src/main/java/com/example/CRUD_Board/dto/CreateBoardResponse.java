package com.example.CRUD_Board.dto;

import com.example.CRUD_Board.entity.BoardEntity;
import lombok.Getter;
@Getter

public class CreateBoardResponse {
    private String title;

    private String content;

    private String createdBy;

    private int id;

    public static CreateBoardResponse toDto(BoardEntity boardEntity) {
        CreateBoardResponse response = new CreateBoardResponse();
        response.title = boardEntity.getTitle();
        response.content = boardEntity.getContent();
        response.createdBy = boardEntity.getCreatedBy();
        response.id = boardEntity.getId();
        return response;
    }
}
