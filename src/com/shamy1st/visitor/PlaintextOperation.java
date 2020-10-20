package com.shamy1st.visitor;

public class PlaintextOperation implements Operation {

	@Override
	public void apply(HeadingNode node) {
		System.out.println("Plaintext of heading node.");
	}

	@Override
	public void apply(AnchorNode node) {
		System.out.println("Plaintext of anchor node.");
	}
}
