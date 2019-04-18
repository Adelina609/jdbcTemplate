package ru.kpfu.itis.springControllers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calc")
public class CalcController {
    @RequestMapping
    public String index(
            @RequestParam(
                    value        = "param1",
                    required     = false,
                    defaultValue = "no"
            ) String param1,
            @RequestParam(
                    value        = "param2",
                    required     = false,
                    defaultValue = "no"
            ) String param2,
            @RequestParam(
                    value        = "operand",
                    required     = false,
                    defaultValue = "no"
            ) String oper,
            ModelMap map){
        String result = "Что-то пошло не так(((";

        if(param1.equals("no")){
            result = "Укажите первый аргумент";
            map.put("result", result);
            return "calc";
        }
        if(param2.equals("no")){
            result = "Укажите второй аргумент";
            map.put("result", result);
            return "calc";
        }

        if(oper.equals("no")){
            result = "Укажите операнд";
            map.put("result", result);
            return "calc";
        } else {
            double parameter1 = Integer.parseInt(param1);
            double parameter2 = Integer.parseInt(param2);

            if (oper.equals("plus")) {
                result = String.valueOf(parameter1 + parameter2);
            }
            if (oper.equals("minus")) {
                result = String.valueOf(parameter1 - parameter2);
            }
            if (oper.equals("multiply")) {
                result = String.valueOf(parameter1 * parameter2);
            }
            if (oper.equals("divide")) {
                result = String.valueOf(parameter1 / parameter2);
            }
        }
        map.put("result", result);
        return "calc";
    }
}
