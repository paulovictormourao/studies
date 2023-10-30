const regex = /[A-Z]/

function rot13(str) {

    let result = ''

    for(let i = 0; i < str.length; i++){
        let strNum = str[i].charCodeAt() + 13

        if (regex.test(str[i])){

            if (strNum > 90){
                strNum = 65 + (strNum % 90) - 1
            }
            result += String.fromCharCode(strNum)

        }

        else{
            result += str[i]
        }

    }


    return result;
}

rot13("SERR YBIR?");