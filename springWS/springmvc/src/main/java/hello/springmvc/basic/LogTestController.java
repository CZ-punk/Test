package hello.springmvc.basic;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

    /**
     * 기존 @Controller 는 return 을 view 이름으로 봔환했다.
     * 근데 @RestController 는 그냥 String 이 반환된다. (Http 메시지 바디에 넣어버림.)
     * 
     * 
     * private final Logger log = LoggerFactory.getLogger(getClass());
     * @Slf4j 와 동일
     */

    //
    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        /**
         * 로그 찍을 때 log.trace("trace log=" + name); 처럼 쓰면 안된다.
         * 연산 후 trace 인 것을 확인하고 필터링 작업을 거치기 때문에
         * 연산을 하여 메모리 자원을 낭비하여 이렇게 짜면 혼난다.
         *
         * 로그는 설정해주면 파일에 남길 수도 있고, 네트워크에 전송할 수도 있다.
         * 로그 파일 사이즈가 특정 넘으면 자동 분할 및 백업 지원
         */

        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info("info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        // 로그를 찍을 때 레벨을 정할 수 있다. (application.properties 에서)
        // 로그를 사용하면 프로세스ID, 쓰레드ID, 시간 정보 등을 알려준다.

        return "ok";
    }


}
