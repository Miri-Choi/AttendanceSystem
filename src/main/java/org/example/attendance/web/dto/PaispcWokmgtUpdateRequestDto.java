package org.example.attendance.web.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@NoArgsConstructor
public class PaispcWokmgtUpdateRequestDto {
    private Long realDate;
    private String perdilStime;
    private String perdilEtime;
    private String restStime;
    private String restEtime;
    private String realTime;
    private String reqRetn;
    private Long userLevel;

    @Builder
    public PaispcWokmgtUpdateRequestDto(Long realDate
            ,String perdilStime
            ,String perdilEtime
            ,String restStime
            ,String restEtime
            ,String realTime
            ,String reqRetn
            ,Long userLevel){

        this.realDate = realDate;
        this.perdilStime = perdilStime;
        this.perdilEtime = perdilEtime;
        this.restStime = restStime;
        this.restEtime = restEtime;
        this.realTime = realTime;
        this.reqRetn = reqRetn;
        this.userLevel = userLevel;
    }
}
