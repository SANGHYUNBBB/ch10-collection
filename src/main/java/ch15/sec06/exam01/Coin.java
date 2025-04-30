package ch15.sec06.exam01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
@Data
@AllArgsConstructor // 전체 매개변수 생성자 자동 생성
@Getter             // Getter 자동 생성

public class Coin {
    private int value;
}