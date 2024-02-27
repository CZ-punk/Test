package konkuk.spring.repository;

import konkuk.spring.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserRepository {

    private static final Map<Long, User> store = new HashMap<>();
    private static long sequence = 0L;

    public User userJoin(User user) {
        user.setUserid(++sequence);
        store.put(user.getUserid(), user);
        return user;
    }

    public User findById(long id) {
        return store.get(id);
    }

    public List<User> findAll() {
        return new ArrayList<>(store.values());
    }

    public void userDrop(User user) {
        removeByUser(store, user);
    }







    // 테스트 코드 용도
    public void clearStore() {
        store.clear();
    }

    // user 삭제 로직
    private void removeByUser(Map<Long, User> store, User user) {
        Iterator<Map.Entry<Long, User>> iterator = store.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Long, User> entry = iterator.next();
            if (entry.getValue().equals(user)) {
                iterator.remove();
                System.out.println("Removed entry with value: " + user);
            }
        }
    }
}
