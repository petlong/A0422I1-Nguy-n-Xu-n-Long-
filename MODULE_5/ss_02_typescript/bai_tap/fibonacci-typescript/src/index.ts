// happy coding 👻
// console.log("hello world");

function fibonacci(number:number): number {
    if (number==1||number==0){
        return number;
    }
    return fibonacci(number-1) + fibonacci(number-2);
}
console.log(fibonacci(2));

function sum(num:number)  {
    let sum = 0;
    for(let i=0; i<num; i++){
        sum += fibonacci(num)
    }
    return sum
}
console.log(sum(3));
