package com.newstar.board.common.response;

public interface ResponseMessage { //? interface는 public static final로 변수선언 무조건 //
    String SUCCESS = "Success";

    String VALIDATE_FAIL = "Validate Fail";

    String EXISTED_EMAIL = "Existed Email";
    String EXISTED_NICKNAME = "Existed Nickname";
    String EXISTED_TEL_NUMBER = "Existed Tel Number";

    String NO_EXISTED_USER = "No Existed User";
    String NO_EXISTED_BOARD = "No Existed Board";

    String NO_PERMISSION = "No Permission";

    String SIGN_IN_FAIL = "Sign In Data Missmatch";

    String DATABASE_ERROR = "Database Error";
}
