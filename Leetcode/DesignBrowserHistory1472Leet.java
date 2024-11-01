import java.util.*;

public class DesignBrowserHistory1472Leet {
    LinkedList<String> ll;
    int pos;
    public DesignBrowserHistory1472Leet(String homepage) {
        ll=new LinkedList<>();
        ll.add(homepage);
        pos=0;
    }
    
    public void visit(String url) {
        while (ll.size() > pos + 1) {
            ll.removeLast();
        }
        ll.add(url);
        pos++;
    }
    public String back(int steps) {
        while (steps!=0 &&  pos>=0) {
            pos--;
            steps--;
        }
        return ll.get(pos);
    }
    
    public String forward(int steps) {
        while (steps!=0 && pos<ll.size()) {
            
            pos++;
            steps--;
        }
        return ll.get(pos);
    }
}
