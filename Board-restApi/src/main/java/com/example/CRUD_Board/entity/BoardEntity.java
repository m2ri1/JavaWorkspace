package com.example.CRUD_Board.entity;

import com.example.CRUD_Board.dto.CreateBoardRequest;
import com.example.CRUD_Board.dto.UpdateBoardRequest;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "crud_board")

public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String content;
    private String title;
    private String createdBy;

    public BoardEntity(CreateBoardRequest createBoardRequest) {
        this.title = createBoardRequest.getTitle();
        this.content = createBoardRequest.getContent();
        this.createdBy = createBoardRequest.getCreatedBy();

    }
    public void updateBoard(UpdateBoardRequest updateBoardRequest) {
        this.title = updateBoardRequest.getTitle();
        this.content = updateBoardRequest.getContent();
        this.createdBy = updateBoardRequest.getCreatedBy();
    }

}
