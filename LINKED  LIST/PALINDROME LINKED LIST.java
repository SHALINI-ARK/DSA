class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null)
           return false;
        Stack<Integer> s = new Stack<>();
        ListNode temp=head;
        while(temp!=null)
        {
            s.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(!s.empty())
        {
            if(s.peek()!=temp.val)
            {
                return false;
            }
            else
            {
                s.pop();
                temp=temp.next;
            }
        }
        return true;
    }
}
