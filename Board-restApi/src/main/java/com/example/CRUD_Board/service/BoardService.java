package com.example.CRUD_Board.service;

import com.example.CRUD_Board.dto.BoardRequest;

import com.example.CRUD_Board.dto.BoardResponseCreate;
import com.example.CRUD_Board.dto.BoardResponseRead;
import com.example.CRUD_Board.dto.BoardResponseReadAll;
import com.example.CRUD_Board.entity.BoardEntity;
import com.example.CRUD_Board.repository.BoardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;


    public BoardResponseCreate createBoard(BoardRequest boardRequest) {
        BoardEntity board = new BoardEntity(boardRequest);
        boardRepository.save(board);
        return new BoardResponseCreate(board);
    }

    public BoardResponseRead readBoard(Integer id) {
        BoardEntity board = boardRepository.findById(id).orElseThrow(() -> new NoSuchElementException("글을 찾을 수 없음"));

        return new BoardResponseRead(board);
    }

    public List<BoardResponseReadAll> readAllBoard() {
        List<BoardEntity> boardList = boardRepository.findAll();
        List<BoardResponseReadAll> BoardResponseReadAllList = new ArrayList<>();
        for (BoardEntity board : boardList) {
            BoardResponseReadAllList.add(
                    new BoardResponseReadAll(board)
            );
        }
        return BoardResponseReadAllList;
    }

    @Transactional
    public Integer updateBoard(Integer id, BoardRequest boardRequest){
        BoardEntity board = boardRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("글을 찾을 수 없음"));
        board.updateBoard(boardRequest);
        return board.getId();

    }

        @Transactional
        public Integer deleteBoard (Integer id){

            boardRepository.deleteById(id);
            return id;
        }

    }
