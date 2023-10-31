package com.containment.assignment;

public class Question {
	int qid;
	String qname;
	
	public Question() {
		
	}
	public Question(int qid, String qname) {
		
		this.qid = qid;
		this.qname = qname;
	}

	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	@Override
	public String toString() {
		return "\nQuestion qid=" + qid + ", qname=" + qname + "]";
	}
	public static void main(String[] args) {

		Question que=new Question();
		System.out.println(que);


	}

}
