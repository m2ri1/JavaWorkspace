package com.example.CRUD_Board.dto;

import com.example.CRUD_Board.entity.BoardEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ReadAllBoardResponse {
    private String title;
    private String createdBy;
    public ReadAllBoardResponse(BoardEntity board) {
        this.title = board.getTitle();
        this.createdBy = board.getContent();
    }

}
