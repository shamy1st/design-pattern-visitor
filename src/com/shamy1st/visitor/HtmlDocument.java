package com.shamy1st.visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
	
	private List<HtmlNode> nodes = new ArrayList<>();
	
	public void add(HtmlNode node) {
		nodes.add(node);
	}
	
	public void highlight() {
		nodes.forEach(node -> node.execute(new HighlightOperation()));
	}
	
	public void plaintext() {
		nodes.forEach(node -> node.execute(new PlaintextOperation()));
	}
}
