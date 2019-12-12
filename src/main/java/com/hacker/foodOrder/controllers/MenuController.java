package com.hacker.foodOrder.controllers;

import com.hacker.foodOrder.beans.Menu;
import com.hacker.foodOrder.services.MenuSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/menu")
public class MenuController {

    @Autowired
    public MenuSerivce menuSerivce;

//    @GetMapping("/greet")
//    public String greet(){return "Welcome!";}

    @PostMapping("/new")
    public Menu createNewMenu(@Valid @RequestBody Menu menu){
        return menuSerivce.insertNewMenu(menu);
    }

    @GetMapping("")
    public Iterable<Menu> getAllMenu(@PageableDefault Pageable pageable){return menuSerivce.findAllMenuItems(pageable);}
}
