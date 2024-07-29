## 요기에 작성 해놓아용 그리고 복붙합세
## 예약어는 대문자, 내가 선언한건 소문자로 쓰면 구분이 쉽지용
CREATE TABLE room (
    id INT NOT NULL AUTO_INCREMENT,
    type VARCHAR(100) NOT NULL,
    price INT NOT NULL,
    PRIMARY KEY (id)
);
SELECT * from 'room';