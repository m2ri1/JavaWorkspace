package com.example.CRUD_Board.controller;

import com.example.CRUD_Board.dto.*;
import com.example.CRUD_Board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @PostMapping
    public CreateBoardResponse creatBoard(@Valid @RequestBody CreateBoardRequest createBoardRequest) {
        return boardService.createBoard(createBoardRequest);
    }

    @GetMapping
    public List<ReadAllBoardResponse> readAllBoard() {
        return boardService.readAllBoard();
    }

    @GetMapping("{id}")
    public ReadBoardResponse readBoard(@PathVariable Integer id) {
        return boardService.readBoard(id);

    }

    @PatchMapping("{id}")
    public Integer updateBoard(@PathVariable Integer id, @Valid @RequestBody UpdateBoardRequest updateBoardRequest) {
        return boardService.updateBoard(id, updateBoardRequest);
    }

    @DeleteMapping("{id}")
    public Integer deleteBoard(@PathVariable Integer id) {
        return boardService.deleteBoard(id);
    }
}