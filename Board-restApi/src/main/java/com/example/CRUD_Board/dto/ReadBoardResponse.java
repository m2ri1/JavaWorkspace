package com.example.CRUD_Board.dto;

import com.example.CRUD_Board.entity.BoardEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter

public class ReadBoardResponse {
    private String title;

    private String content;

    private String createdBy;

/*
    public ReadBoardResponse(BoardEntity boardEntity) {
        this.title = boardEntity.getTitle();
        this.content = boardEntity.getContent();
        this.createdBy = boardEntity.getCreatedBy();
    }
*/

    public static ReadBoardResponse toDto(BoardEntity boardEntity) {
        ReadBoardResponse response = new ReadBoardResponse();
        response.title = boardEntity.getTitle();
        response.content = boardEntity.getContent();
        response.createdBy = boardEntity.getCreatedBy();
        return response;
    }
}