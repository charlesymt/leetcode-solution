class Solution {
    private static String[] map = new String[]{abc, def, ghi, jkl, mno, pqrs, tuv, wxyz};

    public ListString letterCombinations(String digits) {
        if (digits.length() == 0) return Collections.emptyList();
        ListString list = new ArrayList();
        helper(list, digits, );
        return list;
    }

    private void helper(ListString list, String digits, String ans) {
        if (ans.length() == digits.length()) {
            list.add(ans);
            return;
        }
        for (char c  map[digits.charAt(ans.length()) - '2'].toCharArray()) {
            helper(list, digits, ans + c);
        }
    }
}