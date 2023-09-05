package com.newstar.board.dto.request.board;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class PostCommentRequestDto {
    
    @NotBlank
    private String content;
}
