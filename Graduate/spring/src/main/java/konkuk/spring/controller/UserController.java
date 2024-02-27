package konkuk.spring.controller;

import konkuk.spring.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Controller
@Slf4j
public class UserController {

    @Autowired
    UserRepository userRepository;


    // 입력 거꾸로 반환
    @ResponseBody
    @PostMapping("/users")
    public String getMessage(@RequestBody String message) throws IOException {
        log.info("original message = {}", message);
        String reverseMessage = new StringBuilder(message).reverse().toString();
        log.info("reverse message = {}", reverseMessage);
        return reverseMessage;
    }

    @ResponseBody
    @GetMapping("/simpleUI")
    public String simpleUI() {
        return "success";
    }






}
