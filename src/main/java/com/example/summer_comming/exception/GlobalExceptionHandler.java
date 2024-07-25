package com.example.summer_comming.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice //모든 컨트롤러에 예외가 발생하면 낚아챌게~
public class GlobalExceptionHandler {
    //    해당 예외가 발생하면 여기서 처리할게!
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = RoomNotFoundException.class) //value를 안넣어줘도 스프링이 파라미터를 보고 예측해서 처리해줄 수 있음.
    public String catchRoomNotFoundException(RoomNotFoundException e) {
        System.out.println("에러 커밍"+e.getClass());
        return "Room Not Found";
    }
}
