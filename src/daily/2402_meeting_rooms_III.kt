package daily

data class MeetingData(val until: Long, val meetingCount: Long)

fun mostBooked(n: Int, meetings: Array<IntArray>): Int {
    val rooms = Array(n) {
        MeetingData(
            0, 0
        )
    }
    var maxIndex = 0
    var maxCount:Long = 0
    meetings.sortBy {
        it.first()
    }
    for (meet in meetings) {
        val index = findMeetingRoom(rooms, meet.first())
        val d = rooms[index]
        rooms[index] = d.copy(
            until = d.until + (meet[1] - meet.first()) + if (d.until < meet.first()) (meet.first() - d.until) else 0,
            meetingCount = d.meetingCount + 1
        )
        if (maxCount < rooms[index].meetingCount||maxCount==rooms[index].meetingCount&&index<maxIndex) {
            maxIndex = index
            maxCount = rooms[index].meetingCount

        }
    }
    return maxIndex
}
//fun mostBooked(n: Int, meetings: Array<IntArray>): Int {
//    val rooms = Array(n) {
//        MeetingData(
//            0, 0
//        )
//    }
//    meetings.sortBy {
//        it.first()
//    }
//    for (meet in meetings) {
//        val index = findMeetingRoom(rooms, meet.first())
//        val d = rooms[index]
//        rooms[index] = d.copy(
//            until = d.until + (meet[1] - meet.first()) + if (d.until < meet.first()) (meet.first() - d.until) else 0,
//            meetingCount = d.meetingCount + 1
//        )
//    }
//    var maxIndex=0
//    rooms.forEachIndexed { index, meetingData ->
//        if (meetingData.meetingCount>rooms[maxIndex].meetingCount)
//            maxIndex=index
//
//    }
//    return maxIndex
//}

fun findMeetingRoom(rooms: Array<MeetingData>, startTime: Int): Int {
    var minIndex = 0
    rooms.forEachIndexed { index, meetingData ->
        if (meetingData.until <= startTime)
            return index
        if (meetingData.until < rooms[minIndex].until) {
            minIndex = index
        }
    }
    return minIndex
}