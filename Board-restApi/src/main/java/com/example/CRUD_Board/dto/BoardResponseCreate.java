package com.example.CRUD_Board.dto;

import com.example.CRUD_Board.entity.BoardEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter

public class BoardResponseCreate {
    private String title;

    private String content;

    private String createdBy;

    private int id;
    public BoardResponseCreate(BoardEntity boardEntity) {
        this.title = boardEntity.getTitle();
        this.content = boardEntity.getContent();
        this.createdBy = boardEntity.getCreatedBy();
        id = boardEntity.getId();

    }
}
