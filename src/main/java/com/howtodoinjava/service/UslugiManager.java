package com.howtodoinjava.service;

import java.util.List;
import com.howtodoinjava.entity.UslugiEntity;

public interface UslugiManager {
	public void addUslugi(UslugiEntity uslugi);
    public List<UslugiEntity> getAllUslugi();
    public void deleteUslugi(Integer uslugiId);
}
