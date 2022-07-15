var lengthOfLastWord = function(s) {
    s=s.trim();
    let ans = s.lastIndexOf(' ');
    //console.log(ans+1);
    return s.slice(ans+1).length;
};
