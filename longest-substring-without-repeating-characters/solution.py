class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        charMap = {}
        for i in range(256):
            charMap[i] = -1 //定义ascii表大小的数组charMap，存储字符最近一次出现的位置
        ls = len(s)
        i = max_len = 0 // i记录当前不重复串开始位置，max len记录最长记录
        for j in range(ls):
            if charMap[ord(s[j])] >= i:
                i = charMap[ord(s[j])] + 1 //当下次出现重复字母时，设为上次重复字母的后下一个
            charMap[ord(s[j])] = j //更新字符最近一次出现的位置
            max_len = max(max_len, j - i + 1) //比较最大值，当前不重复字符串大小
        return max_len
    