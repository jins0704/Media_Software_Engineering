package com.lab5.Task2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/piglatinmvc")

public class PigLatinController {

    @GetMapping("/translate")
    public ModelAndView getRequestParam(@RequestParam String word){
        ModelAndView modelAndView = new ModelAndView("pigLatin");
        modelAndView.addObject("word", word);
        modelAndView.addObject("pigLatinWord", pigLatinTranslator(word));

        return modelAndView;
    }

    @GetMapping("/translate/{word}")
    public ModelAndView getPathVariable(@PathVariable String word){
        ModelAndView modelAndView = new ModelAndView("pigLatin");
        modelAndView.addObject("word", word);
        modelAndView.addObject("pigLatinWord", pigLatinTranslator(word));

        return modelAndView;
    }

    @GetMapping("/form")
    public ModelAndView getFormParam(@ModelAttribute String word){
        ModelAndView modelAndView = new ModelAndView("pigLatinForm");

        return modelAndView;
    }

    @PostMapping("/form")
    public ModelAndView postFormParam(String word){
        ModelAndView modelAndView = new ModelAndView("pigLatin");
        modelAndView.addObject("word", word);
        modelAndView.addObject("pigLatinWord", pigLatinTranslator(word));

        return modelAndView;
    }
    private static String pigLatinTranslator(String word){

        String lowerWord = word.toLowerCase();
        String trimLowerWord = lowerWord.trim();
        String Result;

        if(trimLowerWord == null || trimLowerWord.length() == 0) {
            Result = "Invalid word!";
        }
        else{
            switch (trimLowerWord.charAt(0)){
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    Result = trimLowerWord + "hay";
                    break;
                default:
                    Result = trimLowerWord.substring(1,trimLowerWord.length()) + trimLowerWord.charAt(0) + "ay";
                    break;
            }
        }

        return Result;
    }
}
