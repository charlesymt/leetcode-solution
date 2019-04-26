public boolean isValid(String s) {
        String leght = "({[";
        String right = ")}]";
        Stack<Character> stack = new Stack<>();
        int tmp;
        for (int i = 0; i < s.length(); i++) {
            if (-1 != (tmp = leght.indexOf(s.charAt(i)))) {
                stack.push(right.charAt(tmp));
            } else if (-1 != right.indexOf(s.charAt(i))) {
                if (stack.empty() || stack.pop() != s.charAt(i)) {
                    return false;
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }