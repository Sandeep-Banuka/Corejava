package com.assign;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
interface Person{
	void dail();
	void press(int a);
	void call(StringBuilder c);
}

public class User implements Person {
	Scanner s=new Scanner(System.in);
	StringBuilder sb=new StringBuilder();
	StringBuilder dailing=new StringBuilder();
	int n=0;
	//ArrayList<String> al=new ArrayList<String>();
	static Stack st=new Stack();
	Stack sttemp=new Stack();
	
	public void press(int d) {
		try {
	dailing.append(d);
		}catch(Exception e) {}
	}
	public void dail(){
		try {
	if(dailing.length()==10) {
		System.out.println("valid dail");
		call(dailing);
		st.push(dailing);
		//n=dailing.length();
		//dailing.delete(0,n);
		
	}
		}catch(Exception e) {}
	}
	
	
	public void call(StringBuilder dailing2) {
		System.out.println("calling:"+dailing2);
	}
	
	
	
	public void CallHistory() throws Exception{
		try {
		System.out.println("Recent call: "+st.peek());
		}catch(Exception e) {}
	}
	
	
	public void DailHistory() {
		System.out.print("Dail History: ");
		while(!st.empty()) {
			System.out.println(st.peek());
			sttemp.push(st.pop());
		}
		while(!sttemp.empty()) {
			st.push(sttemp.pop());
		}
	}
	
	public static void main(String[] args)throws Exception {
		User u=new User();
		User u1=new User();
		User u2=new User();
		u.press(1);
		u.press(1);
		u.press(1);
		u.press(1);
		u.press(1);
		u.press(1);
		u.press(1);
		u.press(1);
		u.press(1);
		u.press(1);
		u.dail();
		u.CallHistory();
		u.DailHistory();
		u1.press(1);
		u1.press(1);
		u1.press(1);
		u1.press(1);
		u1.press(1);
		u1.press(1);
		u1.press(1);
		u1.press(2);
		u1.press(1);
		u1.press(1);
		u1.dail();
		u1.CallHistory();
		u1.DailHistory();
		u2.press(1);
		u2.press(2);
		u2.press(3);
		u2.press(4);
		u2.press(1);
		u2.press(1);
		u2.press(1);
		u2.press(2);
		u2.press(1);
		u2.press(1);
		u2.dail();
		u2.CallHistory();
		u2.DailHistory();
		
		
	}
	
	
}