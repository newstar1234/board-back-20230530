package com.newstar.board.entity;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.newstar.board.dto.request.board.PostCommentRequestDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="comment")
@Table(name="comment")
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commentNumber;
    private int boardNumber;
    private String userEmail;
    private String content;
    private String writeDatetime;

    public CommentEntity(Integer boardNumber, String userEmail, PostCommentRequestDto dto) {

        Date now = Date.from(Instant.now());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String writeDateTime = simpleDateFormat.format(now);

        this.boardNumber = boardNumber;
        this.userEmail = userEmail;
        this.content = dto.getContent();
        this.writeDatetime = writeDateTime;
    }

}
