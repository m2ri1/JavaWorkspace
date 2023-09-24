package com.example.CRUD_Board.dto;

import com.example.CRUD_Board.entity.BoardEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter

public class BoardResponseRead {
    private String title;

    private String content;

    private String createdBy;

    public BoardResponseRead(BoardEntity boardEntity) {
        this.title = boardEntity.getTitle();
        this.content = boardEntity.getContent();
        this.createdBy = boardEntity.getCreatedBy();

    }
}