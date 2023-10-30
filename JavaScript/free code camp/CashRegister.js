const coin = {
    "PENNY": 1/100,
    "NICKEL": 5/100,
    "DIME": 1/10,
    "QUARTER": 1/4,
    "ONE": 1,
    "FIVE": 5,
    "TEN": 10,
    "TWENTY": 20,
    "ONE HUNDRED": 100}

function impossibleChange(cid, value) {

    for (let i = cid.length - 1; i >= 0; i--) {
        let coinValue = coin[cid[i][0]]

        let coinAmount = 0
        let cidCopy = cid[i][1]
        while (value >= coinValue && cidCopy >= 0) {
            value -= coinValue
            cidCopy -= coinValue
            coinAmount += coinValue
        }
    }
    return value > 0.01
}


function registerStatus(cid, changeValue){
    let inHand = 0

    for (let i = 0; i < cid.length; i++){
        inHand += cid[i][1]
    }

    if(inHand < changeValue || impossibleChange(cid, changeValue)){return "INSUFFICIENT_FUNDS"}

    else if (inHand === changeValue){return "CLOSED"}

    else{return "OPEN"}
}


function checkCashRegister(price, cash, cid) {
    let changeValue = cash - price

    let current = {
        status: '',
        change:[]
    }

    current.status = registerStatus(cid, changeValue)

    if (current.status === 'INSUFFICIENT_FUNDS'){return current}

    else if (current.status === 'CLOSED'){
        current.change = cid
        return current
    }

    for (let i = cid.length - 1; i >= 0; i--){
        let coinValue = coin[cid[i][0]]

        let coinAmount = 0

        while(changeValue >= coinValue && cid[i][1] > 0){

            changeValue -= coinValue
            changeValue = Math.round(changeValue * 100) / 100
            cid[i][1] -= coinValue
            coinAmount += coinValue
        }

        if(coinAmount > 0){current.change.push([cid[i][0], Math.round(coinAmount * 100) / 100])}
    }

    return current;
}


console.log(checkCashRegister(19.5, 20, [["PENNY", 0.5], ["NICKEL", 0], ["DIME", 0], ["QUARTER", 0], ["ONE", 0], ["FIVE", 0], ["TEN", 0], ["TWENTY", 0], ["ONE HUNDRED", 0]]))
