package other

fun isPalindrome(x: Int): Boolean {
    if (x<0||(x%10==0&&x>=10))
        return false
    var reverse=0
    var original=x
    while (reverse<original){
        reverse=reverse*10+original%10
        original/=10
    }

    return original==reverse||reverse/10==original
}