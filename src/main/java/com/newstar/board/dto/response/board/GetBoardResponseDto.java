package com.newstar.board.dto.response.board;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.newstar.board.common.response.ResponseCode;
import com.newstar.board.common.response.ResponseMessage;
import com.newstar.board.dto.response.ResponseDto;
import com.newstar.board.entity.BoardViewEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GetBoardResponseDto extends ResponseDto{
    
    private int boardNumber;
    private String title;
    private String content;
    private String imageUrl;
    private String writeDatetime;
    private String writerEmail;
    private String writerNickname;
    private String writerProfileImage;

    private GetBoardResponseDto(String code, String message, BoardViewEntity boardViewEntity) {
        super(code, message);
        this.boardNumber = boardViewEntity.getBoardNumber();
        this.title =boardViewEntity.getTitle();
        this.content = boardViewEntity.getContent();
        this.imageUrl = boardViewEntity.getImageUrl();
        this.writeDatetime = boardViewEntity.getWriteDatetime();
        this.writerEmail = boardViewEntity.getWriterEmail();
        this.writerNickname = boardViewEntity.getWriterNickname();
        this.writerProfileImage = boardViewEntity.getWriterProfileImage();

    }

    public static ResponseEntity<GetBoardResponseDto> success(BoardViewEntity boardViewEntity) {
        GetBoardResponseDto result = new GetBoardResponseDto(ResponseCode.SUCCESS, ResponseMessage.SUCCESS, boardViewEntity);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    public static ResponseEntity<ResponseDto> noExistedBoard() {
        ResponseDto result = new ResponseDto(ResponseCode.NO_EXISTED_BOARD, ResponseMessage.NO_EXISTED_BOARD);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    }
}
