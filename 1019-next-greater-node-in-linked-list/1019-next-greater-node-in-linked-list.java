class Solution {
    public ListNode revLL(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public int sizeLL(ListNode head) {
        ListNode curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    public int[] nextLargerNodes(ListNode head2) {
        Stack<Integer> st = new Stack<>();
        int size = sizeLL(head2);
        ListNode head = revLL(head2);
        ListNode curr = head;
        int[] ans = new int[size];
        int cnt = size-1;
        while (curr != null) {
            while (!st.empty() && st.peek() <= curr.val) {
                st.pop();
            }
            if (st.empty()) {
                ans[cnt--] = 0;
            } else {
                ans[cnt--] = st.peek();
            }
            st.push(curr.val);
            curr = curr.next;
        }
        return ans;
    }
}