package com.hacker.foodOrder.repository;

import com.hacker.foodOrder.beans.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {

}
