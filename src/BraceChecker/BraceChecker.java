package BraceChecker;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        //     char[] chars = text.toCharArray();
        Stack stack = new Stack();
        //  Stack stack2 = new Stack();


        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            switch (ch) {   // bacvox symvol
                case '(':
                case '{':
                case '[':
                    stack.push(i);
                    break;
                case ')':
                    if (text.charAt(stack.pop()) != '(')  // pakvox
                        System.out.println("Error: " + ch + " at " + i);
                    break;
                case '}':
                    if (text.charAt(stack.pop()) != '{') {
                        System.out.println("Error: " + ch + " at " + i);
                    }
                    break;

                case ']':
                    if (text.charAt(stack.pop()) != '[') {
                        System.out.println("Error: " + ch + " at " + i);
                    }
                    break;
                default:
                    break;
            }

        }
//        System.out.println(stack.pop());
//        if (stack.size > 0) {
//            for (int i = 0; i < stack.size; i++) {
//                System.out.println("Error: " + text.charAt(stack.pop()) + " at " + stack.pop());
//            }
//        }
    }
}