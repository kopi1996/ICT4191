package com.example.demo.repo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Model.PrimaryId;

public class Repo<K,V extends PrimaryId<K>> {
	
private Map<K,V> mapData=new HashMap<K,V>();

	
	
	public Collection<V> getAll()
	{
		
		return mapData.values();
	}
	

	public V get(@PathVariable("id") K id)
	{
		
		return mapData.get(id);
	}

	public void add(@RequestBody V value) {
		mapData.put(value.getId(),value);
	}
	

	public void delete(@PathVariable("id") K id)
	{
		mapData.remove(id);
	}

	public void update(@PathVariable("id") K id,@RequestBody V d)
	{
		mapData.replace(id,d);
	}
	
	
}
