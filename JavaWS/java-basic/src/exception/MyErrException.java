package exception;

public class MyErrException extends Exception {
    private String msg;

    // 사용자 커스텀 예외 클래스 생성자
    public MyErrException(String msg) {
        super(msg); // 부모 Exception 클래스 생성자도 호출
        this.msg = msg;
    }

    // 사용자 커스텀 예외 클래스 메시지 출력
    public void printMessage() {
        System.out.println(this.msg);
    }
}

class Main {
    public static void main(String[] args) {
        try {
            throw new MyErrException("나의 커스텀 예외 클래스 메시지");
        } catch (MyErrException e) {
            e.printMessage();
            e.printStackTrace();
        }
    }
}
