const ROMAM_DIGITS = ['M', 'D', 'C', 'L', 'X', 'V', 'I']


function findSubLetter(obj){
    if (obj.num > 100){
        return 100
    }
    else if (obj.num > 10)
        return 10

    else{
        return 1
    }
}

function putLetterMCXI(index, obj, value){

    if (obj.num >= value*0.9 ) {
        let i = 1

        do{

            if (obj.num < value){


                obj.str += ROMAM_DIGITS[index + 2]
                obj.num += findSubLetter(obj)
            }

            i++
            obj.str += ROMAM_DIGITS[index]
            obj.num -= value

        }while ( (obj.num - value >= -0.1 * value) && (i <= 3) )

        if (obj.num >= value*0.9 ){
            obj.str += ROMAM_DIGITS[index + 2] + ROMAM_DIGITS[index]
            obj.num -= value*0.9
        }

    }

    return obj

}

function putLetterDLV(index, obj, value){

    if (obj.num >= value*0.8 ) {

        let i = 1

        do{

            if (obj.num < value){


                obj.str += ROMAM_DIGITS[index + 1]
                obj.num += findSubLetter(obj)
            }

            i++
            obj.str += ROMAM_DIGITS[index]
            obj.num -= value

        }while ( (obj.num - value >= -0.2 * value) && (i <= 3) )

        if (obj.num >= value*0.8 ){
            obj.str += ROMAM_DIGITS[index + 2] + ROMAM_DIGITS[index]
            obj.num -= value*0.8
        }
    }

    return obj

}

function convertToRoman(n) {
    let obj = {
        num : n,
        str : ''
    }



    obj = putLetterMCXI(0, obj, 1000) // M
    obj = putLetterDLV(1, obj, 500)   // D
    obj = putLetterMCXI(2, obj, 100)  // C
    obj = putLetterDLV(3, obj, 50)    // L
    obj = putLetterMCXI(4, obj, 10)   // X
    obj = putLetterDLV(5, obj, 5)     // V
    obj = putLetterMCXI(6,obj, 1)     // I

    console.log(obj)

    return obj.str;
}



convertToRoman(891);
