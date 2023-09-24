package com.example.CRUD_Board.controller;

import com.example.CRUD_Board.dto.BoardRequest;
import com.example.CRUD_Board.dto.BoardResponseCreate;
import com.example.CRUD_Board.dto.BoardResponseRead;
import com.example.CRUD_Board.dto.BoardResponseReadAll;
import com.example.CRUD_Board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("")
    public BoardResponseCreate creatBoard(@RequestBody BoardRequest boardRequest) {
        return boardService.createBoard(boardRequest);
    }

    @GetMapping("/read")
    public List<BoardResponseReadAll> readAllBoard() {
        return boardService.readAllBoard();
    }


    @GetMapping("/read/{id}")
    public BoardResponseRead readBoard(@PathVariable Integer id) {

        return boardService.readBoard(id);

    }

    @PostMapping("/update/{id}")
    public Integer updateBoard(@PathVariable Integer id, @RequestBody BoardRequest boardRequest) {

        return boardService.updateBoard(id, boardRequest);
    }

    @DeleteMapping("/delete/{id}")
    public Integer deleteBoard(@PathVariable Integer id) {
        return boardService.deleteBoard(id);
    }
}