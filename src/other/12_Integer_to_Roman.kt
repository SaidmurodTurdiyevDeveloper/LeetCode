package other




fun intToRoman(num: Int): String {
    var roman = ""
    var number = num
    var count = 0
    while (number > 0) {
        when {
            number >= 1000 -> {
                count = number / 1000
                repeat(count) {
                    roman += "M"
                }
                number %= 1000

            }

            number >= 500 -> {
                if (number >= 900) {
                    roman += "CM"
                    number -= 900
                } else {
                    roman += "D"
                    number -= 500
                }

            }

            number >= 100 -> {
                if (number >= 400) {
                    roman += "CD"
                    number -= 400
                } else {
                    count = number / 100
                    repeat(count) {
                        roman += "C"
                    }
                    number %= 100
                }

            }

            number >= 50 -> {
                if (number >= 90) {
                    roman += "XC"
                    number -= 90
                } else {

                    roman += "L"
                    number -= 50
                }

            }

            number >= 10 -> {
                if (number >= 40) {
                    roman += "XL"
                    number -= 40
                } else {
                    count = number / 10
                    repeat(count) {
                        roman += "X"
                    }
                    number %= 10
                }
            }

            number >= 5 -> {
                if (number == 9) {
                    roman += "IX"
                    number = 0
                }else{

                roman += "V"
                number -= 5
                }
            }

            else -> {
                if (number == 4) {
                    roman += "IV"
                    number = 0
                } else{

                repeat(number) {
                    roman += "I"

                }
                number = 0
                }
            }
        }
    }
    return roman
}