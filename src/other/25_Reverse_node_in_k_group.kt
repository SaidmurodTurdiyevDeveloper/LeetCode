package other

fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
    val ls=ArrayList<ListNode>(k)
    if (head?.next==null)
        return head
    val root=ListNode(head.`val`)
    var current=head.next
    ls.add(root)
    for ( i in 1 until k){
        if (current==null)
            return head
        ls.add(ListNode(current.`val`))
        current=current.next
    }
    for (i in k-1 downTo 1){
        ls[i].next=ls[i-1]
    }
    root.next= reverseKGroup(current,k)
    return ls[k-1]
}