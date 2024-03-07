package daily

import java.util.LinkedList


fun findAllPeople(n: Int, meetings: Array<IntArray>, firstPerson: Int): List<Int> {
    val persons = Array(n) {
        false
    }
    persons[0] = true
    persons[firstPerson] = true
    var knowCount=2
    val timeMeetings = meetings.groupBy {
        it[2]
    }
    timeMeetings.keys.sorted().forEach { key ->
        knowCount+=changePersonsKnow(persons,timeMeetings[key],0,knowCount)
        if (knowCount==n)
            return Array(n){it}.toList()
    }

    val ls = ArrayList<Int>()
    for (i in 0 until n) {
        if (persons[i])
            ls.add(i)
    }
    return ls
}

fun changePersonsKnow(persons:Array<Boolean>,meetings: List<IntArray>?,startedIndex:Int,knowCount:Int):Int{
    if (meetings.isNullOrEmpty())
        return 0
    if (meetings.size<=startedIndex)
        return 0
    val firstIndex=meetings[startedIndex][0]
    val secondIndex=meetings[startedIndex][1]
    if (persons[firstIndex]&&persons[secondIndex]){
        return 0
    }
    if (persons[firstIndex]){
        meetings.forEach {
            if (it[0]==firstIndex||it[1]==secondIndex){

            }
        }
    }
    if (persons[secondIndex]){

    }
    return 0
}