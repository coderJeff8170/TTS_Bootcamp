

const fs = require('fs');
let expenseReport = fs.readFileSync('../expense_report.txt').toString().split("\n");
let expenseReportNums = expenseReport.map(el => parseInt(el));




function getExpenseReportMultiple(report){
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

console.log(getExpenseReportMultiple(expenseReportNums));