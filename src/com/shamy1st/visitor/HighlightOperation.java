package com.shamy1st.visitor;

public class HighlightOperation implements Operation {
	
	@Override
	public void apply(HeadingNode node) {
		System.out.println("highlight heading node.");
	}

	@Override
	public void apply(AnchorNode node) {
		System.out.println("highlight anchor node.");
	}
}
