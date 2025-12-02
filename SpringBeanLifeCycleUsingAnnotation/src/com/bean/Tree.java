package com.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Tree implements Serializable{

	private int ht;
	private String name;

	public Tree() {
		System.out.println("Tree Default Contructor");
	}

	public Tree(int ht, String name) {
		super();
		this.ht = ht;
		this.name = name;
	}

	public int getHt() {
		return ht;
	}

	public void setHt(int ht) {
		System.out.println("Set HT");
		this.ht = ht;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Set Name");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tree [ht=" + ht + ", name=" + name + "]";
	}

	@PostConstruct
	public void initmethod() {
		System.out.println("init Method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy ");
	}

}
