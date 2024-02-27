package konkuk.spring.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Email {

    private Mail mail;
    private List<Mail> email;

    private Long sequence;   // 각 이메일에 대한 고유 ID ( 사용자가 등록한 갯수마다 증가 )

    private String id;
    private String pw;

    public Email(String id, String pw, List<Mail> email) {
        this.id = id;
        this.pw = pw;
        this.email = email;
    }

}
