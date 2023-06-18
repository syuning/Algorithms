/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {number[]}
 */
var reversePrint = function(head) {
    let current = head;
    let array = [];
    while (current !== null) {
        array.push(current.val);
        current = current.next;
    }
    return array.reverse();
};