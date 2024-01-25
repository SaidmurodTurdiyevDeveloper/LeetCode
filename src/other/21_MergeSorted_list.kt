package other

//fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
//    var temp1=list1
//    var temp2=list2
//    var myNode:ListNode?=if(temp1==null) temp2 else if(temp2==null)temp1 else null
//    var temp:ListNode?=null
//    while(temp1!=null&&temp2!=null){
//        if(temp1!!.`val` <= temp2!!.`val`){
//            val node=temp1
//            if(myNode==null){
//                myNode=node
//                temp=myNode
//            }
//            else{
//                temp?.next=node
//                temp=node
//            }
//            temp1=temp1?.next
//            if(temp1==null)
//                temp?.next=temp2
//        }else{
//            val node=temp2
//            if(myNode==null){
//                myNode=node
//                temp=myNode
//            }
//            else{
//                temp?.next=node
//                temp=node
//            }
//            temp2=temp2?.next
//            if(temp2==null)
//                temp?.next=temp1
//
//        }
//    }
//    return myNode
//}