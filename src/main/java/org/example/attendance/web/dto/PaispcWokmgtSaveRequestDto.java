package org.example.attendance.web.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.attendance.domain.pai.PaispcWokmgt;

@Getter
@Data
@NoArgsConstructor
public class PaispcWokmgtSaveRequestDto {
    private Long id;
    private String empno;
    private String hanName;
    private String dilceGbcd;
    private String dilceSdate;
    private String dilceEdate;
    private Long realDate;
    private String perdilStime;
    private String perdilEtime;
    private String restStime;
    private String restEtime;
    private String realTime;
    private String reqRetn;
    private Long userLevel;

    @Builder
    public PaispcWokmgtSaveRequestDto(Long id, String empno
            ,String hanName
            ,String dilceGbcd
            ,String dilceSdate
            ,String dilceEdate
            ,Long realDate
            ,String perdilStime
            ,String perdilEtime
            ,String restStime
            ,String restEtime
            ,String realTime
            ,String reqRetn
            ,Long userLevel){

        this.id = id;
        this.empno = empno;
        this.hanName = hanName;
        this.dilceGbcd = dilceGbcd;
        this.dilceSdate = dilceSdate;
        this.dilceEdate = dilceEdate;
        this.realDate = realDate;
        this.perdilStime = perdilStime;
        this.perdilEtime = perdilEtime;
        this.restStime = restStime;
        this.restEtime = restEtime;
        this.realTime = realTime;
        this.reqRetn = reqRetn;
        this.userLevel = userLevel;
    }

    public PaispcWokmgt toEntity() {
        return PaispcWokmgt.builder()
                .id(id)
                .empno(empno)
                .hanName(hanName)
                .dilceGbcd(dilceGbcd)
                .dilceSdate(dilceSdate)
                .dilceEdate(dilceEdate)
                .realDate(realDate)
                .perdilStime(perdilStime)
                .perdilEtime(perdilEtime)
                .restStime(restStime)
                .restEtime(restEtime)
                .realTime(realTime)
                .reqRetn(reqRetn)
                .userLevel(userLevel)
                .build();
    }

}
