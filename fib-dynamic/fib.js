// Implement Fibonacci with dynamic programming

// First I need to implement Fib iteratively for my own stupidity

function fibIterative(num){
  var a = 0;
  var b = 1;
  var f = 1;
  for(var i = 1; i < num; i++){
    f = a + b;
    a = b;
    b = f;
  }
  return f;
}

console.log('Iterative');
console.log(fibIterative(8));

// Now recursively
function fibRec(num){
  if(num <= 1) return num;

  return fibRec(num-1) + fibRec(num-2);
}

console.log('Recursive');
console.log(fibRec(8));

// Finally I'm ready for dynamic programming...I think
// memoization (top down)
var memo = []
function fibDynamic(num){
  if(num <= 1) return num;
  if(memo[num]) return memo[num];

  memo[num] = fibDynamic(num-1) + fibDynamic(num-2);
  return memo[num];
}


console.log('Dynamic');
console.log(fibDynamic(3));
