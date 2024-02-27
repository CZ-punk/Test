package konkuk.spring.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class EmailManagement {

    private Email email;
    private static List<Email> emailBox;

    public EmailManagement(Email email) {

    }

}
