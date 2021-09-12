package org.example.attendance.web.dto;

import lombok.Getter;
import org.example.attendance.domain.pai.PaispcWokmgt;

@Getter
public class PaispcWokmgtResponseDto {
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

    public PaispcWokmgtResponseDto(PaispcWokmgt entity) {
        this.id = entity.getId();
        this.empno = entity.getEmpno();
        this.hanName = entity.getHanName();
        this.dilceGbcd = entity.getDilceGbcd();
        this.dilceSdate = entity.getDilceSdate();
        this.dilceEdate = entity.getDilceEdate();
        this.realDate = entity.getRealDate();
        this.perdilStime = entity.getPerdilStime();
        this.perdilEtime = entity.getPerdilEtime();
        this.restStime = entity.getRestStime();
        this.restEtime = entity.getRestEtime();
        this.realTime = entity.getRealTime();
        this.reqRetn = entity.getReqRetn();
        this.userLevel = entity.getUserLevel();
    }
}