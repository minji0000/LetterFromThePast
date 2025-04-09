package org.letter.letterfromthepast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//RestController의 주용도는 Json 형태로 객체 데이터를 반환하는 것
//Controller는 return 값을 뷰 이름으로 인식한다.
@Controller
public class LetterController{
    @GetMapping("/letter")
    public String letter(){
        return "letter/letterMainView";
    }

    //git..
}

