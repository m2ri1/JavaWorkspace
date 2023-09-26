package com.example.CRUD_Board.service;

import com.example.CRUD_Board.dto.*;
import com.example.CRUD_Board.entity.BoardEntity;
import com.example.CRUD_Board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    @Transactional
    public CreateBoardResponse createBoard(CreateBoardRequest createBoardRequest) {
        BoardEntity board = new BoardEntity(createBoardRequest);
        boardRepository.save(board);
        return CreateBoardResponse.toDto(board);
    }

    public ReadBoardResponse readBoard(Integer id) {
        BoardEntity board = boardRepository.findById(id).orElseThrow(() -> new RuntimeException());
        return ReadBoardResponse.toDto(board);
    }


    public List<ReadAllBoardResponse> readAllBoard() {
        return boardRepository.findAll().stream()
                .map(ReadAllBoardResponse::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public Integer updateBoard(Integer id, UpdateBoardRequest updateBoardRequest) {
        BoardEntity board = boardRepository.findById(id).orElseThrow(
                () -> new RuntimeException());
        board.updateBoard(updateBoardRequest);
        return board.getId();

    }

    @Transactional
    public Integer deleteBoard(Integer id) {

        boardRepository.deleteById(id);
        return id;
    }

}
