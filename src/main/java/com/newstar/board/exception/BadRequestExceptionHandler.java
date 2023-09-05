package com.newstar.board.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.newstar.board.common.response.ResponseCode;
import com.newstar.board.common.response.ResponseMessage;
import com.newstar.board.dto.response.ResponseDto;

//! @RestController의 참고 //
@RestControllerAdvice
public class BadRequestExceptionHandler {
    //! Bad Request 코드 직접 컨트롤하기 //
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseDto> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException exception) {
        exception.printStackTrace();
        ResponseDto result = new ResponseDto(ResponseCode.VALIDATE_FAIL, ResponseMessage.VALIDATE_FAIL);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
    }

}
