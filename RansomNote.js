/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function(ransomNote, magazine) {
    let ransom = ransomNote.trim().split('');
    let mag = magazine.split('');
    let count =0;
    
    for(let i = 0; i<ransom.length; i++){
        for(let j =0; j<mag.length; j++){
            if(ransom[i]===mag[j]){
                mag[j]=null;
                count++;
                break;
            }
        }
    }
    if(count===ransom.length)
        return true;
    else
        return false;
};
