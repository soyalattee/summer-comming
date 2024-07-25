package com.example.summer_comming.exception;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice //모든 컨트롤러에 예외가 발생하면 낚아챌게~
public class GlobalExceptionHandler {

    //로거팩토리 공장에서 하나 가져올게. 어떤 클래스에서 사용하는지 정의해줘.
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    //    해당 예외가 발생하면 여기서 처리할게!
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = RoomNotFoundException.class) //value를 안넣어줘도 스프링이 파라미터를 보고 예측해서 처리해줄 수 있음.
    public String catchRoomNotFoundException(RoomNotFoundException e) {
        //로거 레벨을 설정 치환해서 중괄호 자리에 넣어준다
        logger.error("Error가 발생했어용~~~ : {}", e.getMessage());
        return "Room Not Found";
    }
}
