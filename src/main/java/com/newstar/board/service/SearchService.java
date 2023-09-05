package com.newstar.board.service;

import org.springframework.http.ResponseEntity;

import com.newstar.board.dto.response.search.GetPopularListResponseDto;
import com.newstar.board.dto.response.search.GetRelationListResponseDto;

public interface SearchService {
    
    // method : 인기검색어 리스트 불러오기 메서드 //
    ResponseEntity<? super GetPopularListResponseDto> getPopularList();
    
    // method : 연관 검색어 리스트 불러오기 메서드 //
    ResponseEntity<? super GetRelationListResponseDto> getRelationList(String searchWord);
    

}
