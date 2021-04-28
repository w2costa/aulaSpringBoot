/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.aula;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Wilson Wolf Costa <wilson.w.costa@gmail.com>
 */
@Controller
public class WebController {
    
    @RequestMapping("hello")
    String ola(Model modelo) {
        System.out.println("Executou hello");
        
        modelo.addAttribute("mensagem", "Bem-vindo ao mundo Spring Boot com IDE Netbeans");
        return "hello.html";
    }
}
