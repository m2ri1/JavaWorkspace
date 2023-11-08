package com.example.api;

import com.example.core.CrudService;
import com.example.core.dto.RequestDto;
import com.example.core.dto.ResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/demo")
public class CrudController {
    private final CrudService crudService;

    @PostMapping
    public ResponseDto create(@RequestBody RequestDto requestDto) {
        return crudService.create(requestDto);
    }

    @GetMapping("/{id}")
    public ResponseDto read(@PathVariable Integer id) {
        return crudService.read(id);
    }

    @PatchMapping("/{id}")
    public Integer update(@PathVariable Integer id, @RequestBody RequestDto requestDto) {
        return crudService.update(id, requestDto);
    }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Integer id) {
        return crudService.delete(id);
    }
}
