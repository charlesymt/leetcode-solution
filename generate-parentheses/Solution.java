class Solution {
    private void addParentheses(List<String> list, String str, int rightNeed, int leftRest) {
        if (rightNeed == 0 && leftRest == 0) {
            list.add(str);
            return;
        }
        if (rightNeed > 0) addParentheses(list, str + ")", rightNeed - 1, leftRest);
        if (leftRest > 0) addParentheses(list, str + "(", rightNeed + 1, leftRest - 1);
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        addParentheses(list, "", 0, n);
        return list;
    }
}