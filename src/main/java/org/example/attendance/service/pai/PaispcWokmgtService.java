package org.example.attendance.service.pai;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.example.attendance.domain.pai.PaispcWokmgt;
import org.example.attendance.domain.pai.PaispcWokmgtRepository;
import org.example.attendance.domain.posts.Posts;
import org.example.attendance.web.dto.*;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PaispcWokmgtService {
    private final PaispcWokmgtRepository paispcWokmgtRepository;

    @Transactional
    public Long save(PaispcWokmgtSaveRequestDto requestDto) {
        return paispcWokmgtRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PaispcWokmgtUpdateRequestDto requestsDto) {
        PaispcWokmgt paispcWokmgt = paispcWokmgtRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));

        paispcWokmgt.update(
                requestsDto.getRealDate(),
                requestsDto.getPerdilStime(),
                requestsDto.getPerdilEtime(),
                requestsDto.getRestStime(),
                requestsDto.getRestEtime(),
                requestsDto.getRealTime(),
                requestsDto.getReqRetn(),
                requestsDto.getUserLevel());
        return id;
    }

    public PaispcWokmgtResponseDto findById(Long id) {
        PaispcWokmgt entity = paispcWokmgtRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));

        System.out.println(entity);
        return new PaispcWokmgtResponseDto(entity);
    }

    public List<PaispcWokmgtResponseDto> findAll() {
        List<PaispcWokmgt> paispcWokmgtList = new ArrayList<>();
        paispcWokmgtList = paispcWokmgtRepository.findAll();
        List<PaispcWokmgtResponseDto> dtoList = new ArrayList<>();

        for(PaispcWokmgt pai:paispcWokmgtList){
            dtoList.add(new PaispcWokmgtResponseDto(pai));
        }
        System.out.println(dtoList);

        return dtoList;


    }
}
