package org.example.attendance.service.posts;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.attendance.domain.posts.Posts;
import org.example.attendance.domain.posts.PostsRepository;
import org.example.attendance.web.dto.PostsResponseDto;
import org.example.attendance.web.dto.PostsSaveRequestDto;
import org.example.attendance.web.dto.PostsUpdateRequestsDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestsDto requestsDto) {
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));

        posts.update(requestsDto.getTitle(), requestsDto.getContent());
        return id;
    }

    public PostsResponseDto findById(Long id) {
        Posts entity = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        return new PostsResponseDto(entity);
    }
}
