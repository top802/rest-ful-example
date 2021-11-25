package top.company.getters.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.company.getters.pojo.Letter;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class LetterController {

    private static String textInLetter = "Hello, %s!";
    private AtomicLong letterId = new AtomicLong();

    @GetMapping("/get/letter")
    public Letter getLetter(@RequestParam(value = "text", defaultValue = "World") String text){
        String letter = String.format(textInLetter, text);
        System.out.println("Letter here => " + letter);

//        HttpResponse firstCurrencyResponse = url("https://api.privatbank.ua/p24api/pubinfo?exchange&json&coursid=11").get();
//        // TODO get PZt from second array and add to first array
////        WS.HttpResponse secondCurrencyResponseGetPlz = WS.url("https://api.privatbank.ua/p24api/pubinfo?exchange&json&coursid=12").get();
//        String currencyJson = firstCurrencyResponse.getString();
//
//
//        RestTemplate restTemplate = new RestTemplate();
//        String url = "https://api.privatbank.ua/p24api/pubinfo";
//        String response = restTemplate.getForObject(url, String.class, new Map("exchange&json&coursid",11));
//        System.out.println("Letter here => " + response);


        return new Letter(letterId.incrementAndGet(), letter);

    }

}
