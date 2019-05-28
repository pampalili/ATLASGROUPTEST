package com.example.BAC0NAT0R;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

import java.net.http.HttpRequest;

@RestController

public class BaconHandler {

    @RequestMapping(value = "give-me-bacon/{howmuch}")
    String getInfo(@PathVariable("howmuch") Integer howmuch) {
        System.out.println("Number of bacon " + String.valueOf(howmuch));
        if (howmuch < 0 || howmuch == 0) {
            return "špatný počet slanin";
        } else {
                     HttpRequest request = HttpRequest.newBuilder()
                         .uri(URI.create("https://baconipsum.com/api/?type=all-meat&paras=1"))
                             .GET()   // this is the default
                                .build();
                              }
    return ("dobrý počet slanin");
    }


}




