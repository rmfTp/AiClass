package exam04;

public interface Calculator {//추상 메서드 정의를 위한 것, abstract가 기본값
    int num = 10;//public static final 생략됨
    int add(int num1, int num2);// public abstract 자동 추가, 구현체가 있으면 오류
}
