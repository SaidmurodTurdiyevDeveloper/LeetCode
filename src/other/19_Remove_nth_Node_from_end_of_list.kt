package other


//class ListNode(var `val`: Int) {
//    var next: ListNode? = null
//}
//
//
//fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
//    var start = head
//    var size = 0
//    while (start != null) {
//        start = start.next
//        size++
//    }
//    if (size >= n) {
//        size = size - n
//        if (size != 0)
//            start = head
//        else {
//            return head?.next
//        }
//        while (start != null) {
//            if (size == 1) {
//                start.next = start.next?.next
//            }
//            start = start.next
//            size--
//        }
//    }
//    return head
//}
