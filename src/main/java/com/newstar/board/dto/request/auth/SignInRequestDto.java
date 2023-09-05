package com.newstar.board.dto.request.auth;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SignInRequestDto {
    @NotBlank
    private String email;
    
    @NotBlank
    private String password;
}


// 만약 int / double을 사용할 경우 Integer/Double-> @NotNull을 사용하는게 나음