package com.newstar.board.service;

import org.springframework.http.ResponseEntity;

import com.newstar.board.dto.request.user.PatchUserNicknameRequestDto;
import com.newstar.board.dto.request.user.PatchUserProfileRequestDto;
import com.newstar.board.dto.response.user.GetSignInUserResponseDto;
import com.newstar.board.dto.response.user.GetUserResponseDto;
import com.newstar.board.dto.response.user.PatchUserNicknameResponseDto;
import com.newstar.board.dto.response.user.PatchUserProfileResponseDto;

public interface UserService {
    
    // method : 유저 정보 불러오기 메서드 //
    ResponseEntity<? super GetUserResponseDto> getUser(String email);

    // method : 로그인 유저 정보 불러오기 메서드 //
    ResponseEntity<? super GetSignInUserResponseDto> getSignInUser(String email);

    // method : 유저 닉네임 수정 메서드 //
    ResponseEntity<? super PatchUserNicknameResponseDto> patchUserNickname(String email, PatchUserNicknameRequestDto dto);

    // method : 유저프로필 수정 메서드 //
    ResponseEntity<? super PatchUserProfileResponseDto> patchUserProfile(String email, PatchUserProfileRequestDto dto);

    
}
