package org.example.attendance.web;

import lombok.RequiredArgsConstructor;
import org.example.attendance.domain.pai.PaispcWokmgt;
import org.example.attendance.service.pai.PaispcWokmgtService;
import org.example.attendance.web.dto.PaispcWokmgtResponseDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PaispcWokmgtService paispcWokmgtService;

    @GetMapping("/")
    public String index(Model model) {

        // Mock Data
        List<PaispcWokmgtResponseDto> paispcWokmgtResponseDtoList = paispcWokmgtService.findAll();

        model.addAttribute("paispcWokmgtList", paispcWokmgtResponseDtoList);

        return "index";
    }

    @GetMapping("/modify")
    public String modify(Model model, @RequestParam("id") long id) {

        PaispcWokmgtResponseDto paispcWokmgtResponseDto = paispcWokmgtService.findById(id);

        model.addAttribute("paispcWokmgt", paispcWokmgtResponseDto);

        return "modify";
    }

    @GetMapping("/save")
    public String save() {

        return "save";
    }
}