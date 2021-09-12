package org.example.attendance.web;

import lombok.RequiredArgsConstructor;
import org.example.attendance.service.posts.PostsService;
import org.example.attendance.web.dto.PostsResponseDto;
import org.example.attendance.web.dto.PostsSaveRequestDto;
import org.example.attendance.web.dto.PostsUpdateRequestsDto;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestsDto requestDto){
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById (@PathVariable Long id){
        return postsService.findById(id);
    }
}
