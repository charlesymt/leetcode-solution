/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode *pNode=NULL,*result;
    int a,b,c=0;
    for(;l1!=NULL ||l2!=NULL||c!=0;)
    {
        if(pNode==NULL)
            result=pNode=(struct ListNode*)malloc(sizeof(struct ListNode));
        else
        {
            pNode=pNode->next=(struct ListNode*)malloc(sizeof(struct ListNode));
        }
        pNode->next=NULL;
        if(l1!=NULL)
        {
            a=l1->val;
            l1=l1->next;
        }
        else
            a=0;
        
        if(l2!=NULL)
        {
            b=l2->val;
            l2=l2->next;
        }
        else
            b=0;
        
        c=a+b+c;
        if(c>=10)
        {
            pNode->val=c-10;
            c=1;
        }else
        {
            pNode->val=c;
            c=0;
        }
    }
    return result;
}