package top.company.getters.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.company.getters.pojo.Letter;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class LetterController {

    private static String textInLetter = "Hello, %s!";
    private AtomicLong letterId = new AtomicLong();

    @GetMapping("/get/letter")
    public Letter getLetter(@RequestParam(value = "text", defaultValue = "World") String text){
        String letter = String.format(textInLetter, text);
        System.out.println("Letter here => " + letter);
        return new Letter(letterId.incrementAndGet(), letter);

    }

}
