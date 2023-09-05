package com.newstar.board.dto.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.newstar.board.common.response.ResponseCode;
import com.newstar.board.common.response.ResponseMessage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor //? 모든 멤버에 대한 생성자 만드는 어노테이션
public class ResponseDto {
    private String code;
    private String message;

    public static ResponseEntity<ResponseDto> databaseError() {
        ResponseDto result = new ResponseDto(ResponseCode.DATABASE_ERROR, ResponseMessage.DATABASE_ERROR);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(result);
    }
}
