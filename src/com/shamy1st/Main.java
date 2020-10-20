package com.shamy1st;

import com.shamy1st.visitor.AnchorNode;
import com.shamy1st.visitor.HeadingNode;
import com.shamy1st.visitor.HtmlDocument;

public class Main {

	public static void main(String[] args) {
		
		HtmlDocument document = new HtmlDocument();
		document.add(new HeadingNode());
		document.add(new AnchorNode());
		document.highlight();
		document.plaintext();
	}
}
