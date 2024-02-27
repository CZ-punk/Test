package hello.core.singletone;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();
    // static 을 써서 클래스 영역에 생성자를 하나만 사용하도록 지정

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직");
    }

}
