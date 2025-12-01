package com.bean;

import java.io.Serializable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Tree implements Serializable, InitializingBean, DisposableBean {

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

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Extra Intialization");
		System.out.println("Serve Water....");

	}

	@Override
	public void destroy() throws Exception {

		System.out.println("Relese resources");
		System.out.println("Ceremoney");

	}

}
