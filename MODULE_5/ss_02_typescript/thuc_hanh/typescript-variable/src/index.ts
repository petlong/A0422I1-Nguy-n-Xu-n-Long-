// happy coding 👻
console.log("hello world");
// practice_01
let width: number;
let height: number;

width = 10.5;
height = 20;

let area: number = width * height;
console.log(`Area of rectangle: ${area}`);

// practice_02: tổng 30 số nguyên tố đầu tiên
let sum2: number = 0;
let count: number = 0;
for (let i = 2; count < 30; i++) {
    let isPrime: boolean = true;
    if (i == 2) {
        sum2 += i;
        continue;
    }
    for (let j = 2; j < Math.sqrt(i); j++) {
        if (i % j == 0) {
            isPrime = false;
            break;
        }
    }
    if (isPrime) {
        continue;
    }
    sum2 += i;
    count++;
}
console.log("Sum of first 30 prime:" + sum2);

//thuc_hanh_3: kiểm tra số nguyên tố và tính tổng
function isPrime(number:number): boolean {
    let isPrime = true;
    if(number<2){
        isPrime = false
    } else if (number>2){
        for (let i=2; i<=Math.sqrt(number);i++){
            if (number%i==0){
                isPrime = false;
                break
            }
        }
    }
    return isPrime;
}

let array = [1, 5, 9, 2, 6, 15, 19, 35, 51, 53];
let sum3 = 0;
for (let number of array){
    if(isPrime(number)){
        sum3+=number;
    }
}
console.log("Tổng các số nguyên tố trong mảng trên là: " + sum3);