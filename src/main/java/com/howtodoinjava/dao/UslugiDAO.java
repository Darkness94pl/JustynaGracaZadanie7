package com.howtodoinjava.dao;

import java.util.List;
import com.howtodoinjava.entity.UslugiEntity;

public interface UslugiDAO
{
    public void addUslugi(UslugiEntity uslugi);
    public List<UslugiEntity> getAllUslugi();
    public void deleteUslugi(Integer uslugiId);
}