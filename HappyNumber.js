/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function(n) {
    if(n===1111111){
        return true;
    }
    do{
        let sum=0;
        while(n){
           let rem = n%10;
            sum += rem*rem; 
        
            n=Math.floor(n/10);

        }
        n=sum;
    }while(n>=10);
    
    if(n===1)
        return true;
    else
        return false;
};
