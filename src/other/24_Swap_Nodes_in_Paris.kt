package other


fun swapPairs(head: ListNode?): ListNode? {
    if(head?.next==null)
        return head
    val cur=ListNode(head!!.`val`)
    val next=ListNode(head?.next!!.`val`)
    next.next=cur
    cur.next=swapPairs(head?.next?.next)
    return next
}