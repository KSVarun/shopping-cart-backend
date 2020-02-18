package com.hacker.foodOrder.services;

import com.hacker.foodOrder.beans.Menu;
import com.hacker.foodOrder.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public class MenuSerivce {

    @Autowired
    private MenuRepository menuRepository;

    public Menu insertNewMenu(Menu menu){
        return menuRepository.save(menu);
    }

    public Page<Menu> findAllMenuItems(Pageable pageable){
        return menuRepository.findAll(pageable);
    }
}
