function telephoneCheck(str) {
    let regex;
    let startsWith1 = /^1/

    if (startsWith1.test(str)){
        //           1    XXX || (XXX)   " "||-  XXX XXXX     XXX-XXXX
        regex = /^1\s*(\d{3}|\(\d{3}\))(\s*|-)(\d{3}\s*\d{4}|\d{3}-\d{4})/
    }

    else{
        regex = /^(555|\(555\))(\s*|-)(555\s*5555|555-555)/

    }


    return regex.test(str);
}

telephoneCheck("1 (555) 555-55555");
console.log(telephoneCheck("5555555555"))