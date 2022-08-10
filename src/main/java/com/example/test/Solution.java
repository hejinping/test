package com.example.test;

/**
 * Definition for singly-linked list.
 */


class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode sumHead = new ListNode(-1);
        ListNode sumNode = sumHead;

        while (l1 != null || l2 != null) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;

            int sum = x + y + carry;

            if (sum >= 10) {
                carry = 1;
                sum = sum - 10;
            } else {
                carry = 0;
            }

            sumNode.next = new ListNode(sum);
            l1 = l1.next != null ? l1.next : null;
            l2 = l2.next != null ? l2.next : null;
            sumNode = sumNode.next;

        }
        if (carry != 0) {
            sumNode.next = new ListNode(carry);
        }
        return sumHead.next;

    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode();
        node1.val = 2;
        ListNode node11 = new ListNode();
        node11.val = 4;
        ListNode node12 = new ListNode();
        node12.val = 3;

        node1.next = node11;
        node11.next = node12;


        ListNode node2 = new ListNode();
        node2.val = 8;
        ListNode node21 = new ListNode();
        node21.val = 6;
        ListNode node22 = new ListNode();
        node22.val = 7;

        node2.next = node21;
        node21.next = node22;


        ListNode node = addTwoNumbers(node1, node2);
        System.out.println(123);


    }
}