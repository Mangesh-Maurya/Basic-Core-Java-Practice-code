package com.java.batch.oops.accessifier;

public class DocGenerate {
	
	
	public void generateDocument() {
		String docName = getDocName();
		System.out.println(docName);
	}
	
	protected String getDocName() {
		NameGenerator nameGenerator = new NameGenerator();
		return nameGenerator.getDocName();
	}
}
