package com.example.BAC0NAT0R;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BACONAPP {

    public static void main(String[] args) {
        SpringApplication.run(BACONAPP.class, args);
        long millis = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(millis);
        System.out.println(timestamp);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH.mm.ss");

    }






    }


