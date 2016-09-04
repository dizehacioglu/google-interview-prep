// Implement an algorithm that gets all combinations of a string

function combinations(head, tail){
  console.log(head);

  if(tail.length > 0){
    for (var i = 0; i < tail.length; i++) {
      var next = head + tail[i];
      var remaining = tail.substring(0, i) + tail.substring(i+1);
      combinations(next, remaining);
    }
  }

}

combinations('', 'abc');

function permutations(head, tail){
  if(!tail.length) console.log(head);

  for (var i = 0; i < tail.length; i++) {
    var next = head + tail[i];
    var rem = tail.substring(0, i) + tail.substring(i+1);
    permutations(next, rem);
  }
}

permutations('', 'abc');
