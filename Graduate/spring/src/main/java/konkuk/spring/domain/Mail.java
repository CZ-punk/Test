package konkuk.spring.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class Mail {

    private long sequence;    // 각 메일에 대한 고유 ID

    private String senderName;  // 보내는 사람 이름
    private String senderAddress;   // 보내는 사람 주소
    private String receiverName;    // 받는 사람 이름
    private String receiverAddress; // 받는 사람 주소

    private String title;   // 메일 제목
    private String contents;    // 메일 내용 ( 미디어 파일 추가 예정 )
    private boolean favorites = false;  // 즐찾 유무
    private boolean block = false;  // 차단 유무

    
    private LocalDateTime currentDateTime = LocalDateTime.now();    // 메일 수신 날짜

}
