public class GoalParser1678Leet {
    public String interpret(String command) {
        return (command.replace("()", "o")).replace("(al)", "al");
    }
    public static void main(String[] args) {
        System.out.println((new GoalParser1678Leet()).interpret("G()(al)"));
    }
}
