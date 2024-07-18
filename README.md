# Spring 플젝 

뚝딱 뚝딱 Java + Spring 연습 


## 학습내용 

### @Controller vs @RestController 

response body를 담아서 주면 @RestController  
그냥 @Controller에서는 '뷰'를 반환한다.  
@RestController는 '데이터'를 반환한다.  

#### 차이점
데이터를 반환하기 위해서는 @Responsebody 를 사용하면 된다.   
 @RestController == @Controller + @Responsebody  


### @ReqeustMapping
이친구는 핸들러다.  
사용자의 요청에 의해 호출되는 메소드를 핸들러라고한다.  
@Controller와 같이 사용되는 세트로, Controller 안에서 메소드를 요청과 매핑해준다. 
