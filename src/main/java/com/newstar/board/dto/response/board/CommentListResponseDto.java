package com.newstar.board.dto.response.board;

import java.util.ArrayList;
import java.util.List;

import com.newstar.board.entity.resultSet.CommentListResultSet;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CommentListResponseDto {
    
    private String profileImageUrl;
    private String nickname;
    private String writeDatetime;
    private String content;

    public CommentListResponseDto(CommentListResultSet resultSet) {
        this.profileImageUrl = resultSet.getProfileImageUrl();
        this.nickname = resultSet.getNickname();
        this.writeDatetime = resultSet.getWriteDatetime();
        this.content = resultSet.getContent();
    } 

    public static List<CommentListResponseDto> copyList(List<CommentListResultSet> resultSets) {

        List<CommentListResponseDto> commentList = new ArrayList<>();

        for (CommentListResultSet resultSet: resultSets) {
            CommentListResponseDto commentItem = new CommentListResponseDto(resultSet);
            commentList.add(commentItem);
        }

        return commentList;
    }

}

// user와 comment 테이블을 조인해서 사용해야함 
// comment columns에 다 없어서