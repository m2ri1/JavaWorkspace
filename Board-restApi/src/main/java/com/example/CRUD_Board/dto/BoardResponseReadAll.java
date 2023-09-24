package com.example.CRUD_Board.dto;

import com.example.CRUD_Board.entity.BoardEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardResponseReadAll {
    private String title;
    private String createdBy;
    public BoardResponseReadAll(BoardEntity board) {
        this.title = board.getTitle();
        this.createdBy = board.getContent();
    }

}
