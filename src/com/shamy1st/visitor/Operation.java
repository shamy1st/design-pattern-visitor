package com.shamy1st.visitor;

public interface Operation {
	void apply(HeadingNode node);
	void apply(AnchorNode node);
}
