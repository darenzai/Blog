package com.darenzai.demo01.web.dao;

import com.darenzai.demo01.web.beans.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDAO extends JpaRepository<Category,Integer> {



}
