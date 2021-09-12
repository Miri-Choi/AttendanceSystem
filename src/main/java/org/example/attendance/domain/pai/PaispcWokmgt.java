package org.example.attendance.domain.pai;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Data
public class PaispcWokmgt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 7, nullable = false)
    private String empno;
    @Column(length = 10, nullable = false)
    private String hanName;
    @Column(length = 10, nullable = false)
    private String dilceGbcd;
    @Column(length = 8, nullable = false)
    private String dilceSdate;
    @Column(length = 8, nullable = false)
    private String dilceEdate;

    private Long realDate;

    @Column(length = 4)
    private String perdilStime;
    @Column(length = 4)
    private String perdilEtime;
    @Column(length = 4)
    private String restStime;
    @Column(length = 4)
    private String restEtime;
    @Column(length = 4)
    private String realTime;
    @Column(columnDefinition = "TEXT")
    private String reqRetn;

    private Long userLevel;


    @Builder
    public PaispcWokmgt(Long id, String empno
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
            ,Long userLevel) {

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

    public void update(
            Long realDate
            , String perdilStime
            , String perdilEtime
            , String restStime
            , String restEtime
            , String realTime
            , String reqRetn
            , Long userLevel) {

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
