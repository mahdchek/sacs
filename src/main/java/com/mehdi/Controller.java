package com.mehdi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by m_che on 11/04/2018.
 */

@RestController
public class Controller {

@RequestMapping("/test")
    public String test(){
    return "test";
}

}
