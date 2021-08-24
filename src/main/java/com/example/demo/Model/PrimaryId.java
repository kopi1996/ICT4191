package com.example.demo.Model;

public class PrimaryId<K> {
	protected K id;

	public PrimaryId(K id) {

		this.id = id;
	}

	public K getId() {
		return id;
	}

	public void setId(K id) {
		this.id = id;
	};
	
	
}
