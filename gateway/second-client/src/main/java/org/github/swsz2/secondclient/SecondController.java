package org.github.swsz2.secondclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SecondController {

    @GetMapping(value = "hello")
    public String hello() {
        log.info("hello second");
        return "hello second";
    }
}
