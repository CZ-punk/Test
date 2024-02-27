package konkuk.spring.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {

    private Long userid;
    private String username;

    private String emailId;
    private String emailPw;

    private EmailManagement emailBox;

    public User() {

    }

    public User(String username, String emailId, String emailPw, EmailManagement emailBox) {
        this.username = username;
        this.emailId = emailId;
        this.emailPw = emailPw;
        this.emailBox = emailBox;
    }
}

/**
 *
 * 계정 생성일, 마지막 로그인일
 *
 *
 *
 * 이메일 모델 설계, 이메일함 모델 설계
 *
 *
 */