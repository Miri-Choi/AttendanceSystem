package org.example.attendance.web;

import lombok.RequiredArgsConstructor;
import org.example.attendance.domain.pai.PaispcWokmgt;
import org.example.attendance.service.pai.PaispcWokmgtService;
import org.example.attendance.service.posts.PostsService;
import org.example.attendance.web.dto.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController

public class PaispcWokmgtApiController {
    private final PaispcWokmgtService paispcWokmgtService;

    @PostMapping("/api/v1/pai")
    public Long save(@RequestBody PaispcWokmgtSaveRequestDto requestDto) {
        System.out.println(requestDto);
        return paispcWokmgtService.save(requestDto);
    }

    @PutMapping("/api/v1/pai/{id}")
    public Long update(@PathVariable Long id, @RequestBody PaispcWokmgtUpdateRequestDto requestDto){
        System.out.println(requestDto);
        return paispcWokmgtService.update(id, requestDto);
    }

    @GetMapping("/api/v1/pai/{id}")
    public PaispcWokmgtResponseDto findById (@PathVariable Long id){
        return paispcWokmgtService.findById(id);
    }

    @GetMapping("/api/v1/pai/all")
    public List<PaispcWokmgtResponseDto> findAll (){
        return paispcWokmgtService.findAll();
    }
}
