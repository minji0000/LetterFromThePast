package org.letter.letterfromthepast.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController의 주용도는 Json 형태로 객체 데이터를 반환하는 것
@RestController
public class LetterController{
    @GetMapping("/letter")
    public String letter(){
        return "/letter/letterMainView";
    }
}

