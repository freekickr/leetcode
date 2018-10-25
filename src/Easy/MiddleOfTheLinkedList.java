package Easy;

/*
Middle of the Linked List

Given a non-empty, singly linked list with head node head, return a middle node of linked list.
If there are two middle nodes, return the second middle node.

Example 1:
    Input: [1,2,3,4,5]
    Output: Node 3 from this list (Serialization: [3,4,5])
    The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
    Note that we returned a ListNode object ans, such that:
    ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.

Example 2:
    Input: [1,2,3,4,5,6]
    Output: Node 4 from this list (Serialization: [4,5,6])
    Since the list has two middle nodes with values 3 and 4, we return the second one.

Note:
    The number of nodes in the given list will be between 1 and 100.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

//The best easy exercise to practice recursion
public class MiddleOfTheLinkedList {

    public static ListNode middleNode(ListNode head) {
        int depth = findDepth(head);
        return getNode(head, (depth/2) + 1);
    }

    public static int findDepth(ListNode node) {
        int depth = 1;
        if (node.next == null)
            return depth;
        return depth + findDepth(node.next);
    }

    public static ListNode getNode(ListNode node, int n) {
        if (n == 1)
            return node;
        return getNode(node.next, --n);
    }

    public static void main(String[] args) {
        ListNode node6 = new ListNode(6, null);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        System.out.println(middleNode(node1));
    }
}

//slightly changed it to make a nodes chain
class ListNode {
    int val;
    ListNode next;

    ListNode(int x, ListNode nextNode) {
        val = x;
        next = nextNode;
    }

    @Override
    public String toString() {
        return "" + val;
    }
}