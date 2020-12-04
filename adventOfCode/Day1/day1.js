

const fs = require('fs');
let expenseReport = fs.readFileSync('../expense_report.txt').toString().split("\n");
let expenseReportNums = expenseReport.map(el => parseInt(el));




function getExpenseReportMultipleTwoNums(report){
    //a for loop to check each number
    for(let i=0; i<report.length; i++){
        let numberToCheck = report[i];
        for(let j=1; j<report.length; j++){
            let numberToAdd = report[j];
            if (numberToCheck + numberToAdd === 2020){
                return numberToCheck * numberToAdd;
            }
        }
    }
}

function getExpenseReportMultipleThreeNums(report){
    //a for loop to check each number
    for(let i=0; i<report.length; i++){
        let numberToCheck = report[i];
        for(let j=1; j<report.length; j++){
            let numberToAdd = report[j];
            for(let k=2; k<report.length; k++){
                let secondNumberToAdd = report[k];
                if (numberToCheck + numberToAdd + secondNumberToAdd === 2020){
                    return numberToCheck * numberToAdd * secondNumberToAdd;
                }
            }
        }
    }
}


console.log(getExpenseReportMultipleTwoNums(expenseReportNums));
console.log(getExpenseReportMultipleThreeNums(expenseReportNums));