package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();

        // 이미 a 의 User 라는 애를 import 했기 때문에 겹칠 수 없다. (b 의 User 불가능)

        // 즉, 같은 이름의 클래스가 있을 때는 import 는 둘 중 하나만 할 수 있다.
    }
}
