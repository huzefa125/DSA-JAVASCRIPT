// let prompt = require('prompt-sync')();
// let n = Number(prompt("Enter a number"))
// for (let i = 1; i <= n; i++) {
//     for(let j =1; j<= n;j++){
//        process.stdout.write("* ")
//     }
//     console.log();
// }

// let prompt = require('prompt-sync')();
// let n = Number(prompt("Enter a number"))
// for (let i = 1; i <= n; i++) {
//     for(let j =1; j<= i;j++){
//        process.stdout.write("* ")
//     }
//     console.log();
// }

// let prompt = require('prompt-sync')();
// let n = Number(prompt("Enter a number"))
// for (let i = 1; i <= n; i++) {
//     for(let j =1; j<= i;j++){
//        process.stdout.write(j + " ")
//     }
//     console.log();
// }

// let prompt = require('prompt-sync')();
// let n = Number(prompt("Enter a number"))
// for (let i = 1; i <= n; i++) {
//     let ascii = 65
//     for(let j =1; j<= i;j++){
//        process.stdout.write(String.fromCharCode(ascii) + " ")
//        ascii++;
//     }
//     console.log();
// }


// let prompt = require('prompt-sync')();
// let n = Number(prompt("Enter a number"))
// for (let i = 1; i <= n; i++) {
//     for (let j = n; j >= i; j--) {
//         process.stdout.write("* ");
//     }
//     console.log();
// }


// let prompt = require('prompt-sync')();
// let n = Number(prompt("Enter a number"))
// for (let i = 1; i <= n; i++) {
//    for (let j = 1; j <= n - i; j++) {
//     process.stdout.write("  ")
//    }
//    for (let j = 1; j <= i; j++) {
//     process.stdout.write("* ")
//    }
//     console.log();
// }

// let prompt = require('prompt-sync')();
// let n = Number(prompt("Enter a number"))
// for (let i = 1; i <= n; i++) {
//    for (let j = 1; j <= n - i; j++) {
//     process.stdout.write(" ")
//    }
//    for (let j = 1; j <= i; j++) {
//     process.stdout.write("* ")
//    }
//     console.log();
// }

let prompt = require('prompt-sync')();
let n = Number(prompt("Enter a number: "));

for(let i = 0; i < n; i++){
    for(let j = 0; j < n; j++){
        if (j == i || j == n - 1 - i) {
            process.stdout.write("* ");
        }
        else{
            process.stdout.write("  ");
        }   
    }
    console.log();
}



// let prompt = require('prompt-sync')();
// let n = Number(prompt("Enter a number"))
//     for (let i = 1; i < 2*n; i++) {
//         for(j=1; j<= 2*n; j++){
//             if (i == j || i + j == 2*n ) {
//                 process.stdout.write("* ")
//             }
//             else{
//                  process.stdout.write("  ")
//             }
//         }
//         console.log();
//     }

