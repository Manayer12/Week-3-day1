package com.example.hw1week3;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.reflect.Array;


    @RestController
    @RequestMapping(path = "/check")
    public class welcomeController {


        @GetMapping(path = "/name")
        public String name(){

            return "MY name is manayer";
        }

        @GetMapping(path = "/age")
        public String age(){
            int age=23;

            return "MY age is"+age;
        }

        @GetMapping(path = "/status")
        public String stat(){


            return "Everything OK";
        }




        @GetMapping(path = "/health")
        public String health(){

            return "Server health is up and running";
        }


        @GetMapping(path = "/names")
        public String[] names(){
            String[] arr ={"khaild","Sara","salma","Nora"};

               return arr;
        }}


