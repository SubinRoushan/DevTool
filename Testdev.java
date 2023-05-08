package com.devtool.DevTool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Testdev {
@RequestMapping("/test")
@ResponseBody
    public String test()
    {
        int a=10;
        int b=20;
        int c=10;
        return "sum is ="+(a+b+c);
    }
}
