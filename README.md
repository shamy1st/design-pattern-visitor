# Visitor Design Pattern (Java Implementation)

**Visitor** add new operation to an object structure without modifying it.
![](https://github.com/shamy1st/design-pattern-visitor-java/blob/main/visitor-uml.png)
### Problem: 
You have a **HtmlDocument** with list of **HtmlNode** and existing operation **highlight**, now you want to add another operation **plaintext** to get the content of any **HtmlNode**.

The issue is everytime you want to add a new operation like **plaintext**, you need to implement it into each class which implements **HtmlNode** + modify the **HtmlDocument** class, this approach violate [Open–closed principle](https://en.wikipedia.org/wiki/Open%E2%80%93closed_principle).

    public class Main {
        public static void main(String[] args) {
            HtmlDocument document = new HtmlDocument();
            document.add(new HeadingNode());
            document.add(new AnchorNode());
            document.highlight();
            //document.plaintext();
        }
    }

    public class HtmlDocument {
        private List<HtmlNode> nodes = new ArrayList<>();
        
        public void add(HtmlNode node) {
            nodes.add(node);
        }
        
        public void highlight() {
            nodes.forEach(node -> node.highlight());
        }
    }

    public interface HtmlNode {
        void highlight();
    }

    public class HeadingNode implements HtmlNode {
        @Override
        public void highlight() {
            System.out.println("Heading node highlight.");
        }
    }

    public class AnchorNode implements HtmlNode {
        @Override
        public void highlight() {
            System.out.println("Anchor node highlight.");
        }
    }
### Solution:
![](https://github.com/shamy1st/design-pattern-visitor-java/blob/main/visitor-solution-uml.png)
