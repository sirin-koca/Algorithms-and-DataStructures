package examples;

import java.util.Stack;

public class BrowserHistory {
    private Stack<String> history;

    public BrowserHistory() {
        history = new Stack<>();
    }

    // Visit a new URL
    public void visit(String url) {
        history.push(url);
    }

    // Go back to the previous URL
    public void goBack() {
        if (!history.isEmpty()) {
            history.pop();
        }
    }

    // Show the current URL
    public String showCurrentPage() {
        if (!history.isEmpty()) {
            return history.peek();
        } else {
            return "No pages visited yet!";
        }
    }

    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();
        browser.visit("google.com");
        browser.visit("openai.com");
        System.out.println("Current page: " + browser.showCurrentPage()); // Should print openai.com
        browser.goBack();
        System.out.println("After going back: " + browser.showCurrentPage()); // Should print google.com
    }
}
