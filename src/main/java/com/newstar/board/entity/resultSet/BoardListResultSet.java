package com.newstar.board.entity.resultSet;

public interface BoardListResultSet {
    int getBoardNumber();
    String getTitle();
    String getContent();
    String getImageUrl();
    int getViewCount();
    int getCommentCount();
    int getFavoriteCount();
    String getWriteDatetime();
    String getWriterProfileImage();
    String getWriterNickname();
}
