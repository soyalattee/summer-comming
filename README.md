# Spring 플젝 

뚝딱 뚝딱 Java + Spring 연습 


## 학습내용 

### @Controller vs @RestController 

response body를 담아서 주면 @RestController  
그냥 @Controller에서는 '뷰'를 반환한다.  
@RestController는 '데이터'를 반환한다.  

#### 차이점
데이터를 반환하기 위해서는 @Responsebody 를 사용하면 된다. 
@Controller + @Responsebody == @RestController
