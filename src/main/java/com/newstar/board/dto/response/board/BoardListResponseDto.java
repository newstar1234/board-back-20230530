package com.newstar.board.dto.response.board;

import java.util.ArrayList;
import java.util.List;

import com.newstar.board.entity.BoardViewEntity;
import com.newstar.board.entity.resultSet.BoardListResultSet;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoardListResponseDto {
    
    private int boardNumber;
    private String title;
    private String content;
    private String imageUrl;
    private int viewCount;
    private int commentCount;
    private int favoriteCount;
    private String writeDatetime; // boardRepository 사용

    private String writerProfileImage;  //userRepository 사용
    private String writerNickname;

    //? 생성자 생성 // 
    public BoardListResponseDto (BoardListResultSet resultSet) {
        this.boardNumber = resultSet.getBoardNumber();
        this.title = resultSet.getTitle();
        this.content = resultSet.getContent();
        this.imageUrl = resultSet.getImageUrl();
        this.viewCount = resultSet.getViewCount();
        this.commentCount = resultSet.getCommentCount();
        this.favoriteCount = resultSet.getFavoriteCount();
        this.writeDatetime = resultSet.getWriteDatetime();
        this.writerProfileImage = resultSet.getWriterProfileImage();
        this.writerNickname = resultSet.getWriterNickname();
    }

    // ? top3 생성자
    public BoardListResponseDto (BoardViewEntity boardViewEntity) {
        this.boardNumber = boardViewEntity.getBoardNumber();
        this.title = boardViewEntity.getTitle();
        this.content = boardViewEntity.getContent();
        this.imageUrl = boardViewEntity.getImageUrl();
        this.viewCount = boardViewEntity.getViewCount();
        this.commentCount = boardViewEntity.getCommentCount();
        this.favoriteCount = boardViewEntity.getFavoriteCount();
        this.writeDatetime = boardViewEntity.getWriteDatetime();
        this.writerProfileImage = boardViewEntity.getWriterProfileImage();
        this.writerNickname = boardViewEntity.getWriterNickname();
    }

    // ? 반복돌면서 그 요소를 BoardListResponseDto의 인스턴스로 바꿔서 새로운 list에 담아둠
    public static List<BoardListResponseDto> copyList(List<BoardListResultSet> resultSets){
        List<BoardListResponseDto> boardList = new ArrayList<>();

        // ? forEach로 반복
        for (BoardListResultSet resultSet : resultSets) {
            BoardListResponseDto board = new BoardListResponseDto(resultSet);
            boardList.add(board);
        }

        return boardList;
    }

    // ? top3
    public static List<BoardListResponseDto> copyEntityList(List<BoardViewEntity> boardViewEntities){
        List<BoardListResponseDto> boardList = new ArrayList<>();

        // ? forEach로 반복
        for (BoardViewEntity entity : boardViewEntities) {
            BoardListResponseDto board = new BoardListResponseDto(entity);
            boardList.add(board);
        }

        return boardList;
    }

}


