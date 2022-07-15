/**
 * @param {number[]} digits
 * @return {number[]}
 */

var plusOne= function(digits) {
let answer='';
    
    for(let i=0; i<digits.length; i++){
 
        answer+=digits[i];
        //console.log(answer);
    }
    let sum=BigInt(answer);
  //  console.log(sum);
    sum++;
    return sum.toString().split('');
};
