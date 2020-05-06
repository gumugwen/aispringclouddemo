package com.southwind.repository;

import com.southwind.entity.Menu;


import java.util.List;


public interface MenuRepository {
    public List<Menu> findAll(int index, int limit);
//    public List<Menu> findAll(int index,int limit);  //自己修改
    public int count();
    public Menu findById(long id);
    public void save(Menu menu);
    public void update(Menu menu);
    public void deleteById(long id);
}