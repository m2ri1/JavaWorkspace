package com.example.CRUD_Board.entity;

import com.example.CRUD_Board.dto.BoardRequest;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Data
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

    public BoardEntity(BoardRequest boardRequest) {
        this.title = boardRequest.getTitle();
        this.content = boardRequest.getContent();
        this.createdBy = boardRequest.getCreatedBy();

    }

    public void updateBoard(BoardRequest boardRequest) {
        this.title = boardRequest.getTitle();
        this.content = boardRequest.getContent();
        this.createdBy = boardRequest.getCreatedBy();
    }

}
