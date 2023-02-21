package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class OutputController {

    @PostMapping("/confirm")
    public String postOutput(@RequestParam("val1") String val1, Model model) {
        model.addAttribute("val1", val1);

        //output.htmlに遷移
        return "output";
    }

}
