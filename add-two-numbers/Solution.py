# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        a = 0
        head = curr = ListNode(0)
        while l1 or l2:
            v = a
            if l1 :
                v += l1.val
                l1 = l1.next
            if l2 :
                v += l2.val
                l2 = l2.next
            curr.next = ListNode(int(v%10))
            curr = curr.next
            a= int(v/10)
        if a > 0:
            curr.next = ListNode(a)
        return head.next
        