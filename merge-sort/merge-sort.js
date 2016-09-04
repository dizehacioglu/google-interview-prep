// Describe recursive mergesort and its runtime.
// Write an iterative version in C++/Java/Python.

var helper = [];
var list = [5,4,3,2,1];
console.log("Presort", list);
mergeSort(list, helper, 0, list.length - 1);
console.log("Postsort", list);

function mergeSort(list, helper, low, high){
  if(low < high){
    var middle = (low + high) / 2;
    mergeSort(list, helper, low, middle);
    mergeSort(list, helper, middle+1, high);
    merge(list, helper, low, middle, high);
  }
}

function merge(list, helper, low, middle, high){
  for (var i = low; i <= high; i++) {
    helper[i] = list[i];
  }

  var helperLeft = low;
  var helperRight = middle + 1;
  var current = low;

  while(helperLeft <= middle && helperRight <= high){
    if(helper[helperLeft] <= helper[helperRight]){
      list[current] = helper[helperLeft];
      helperLeft++;
    } else {
      list[current] = helper[helperRight];
      helperRight++;
    }
    current++;
  }

  var remaining = middle - helperLeft;
  for (var i = 0; i < remaining; i++) {
    list[current + i] = helper[helperLeft + i];
  }
}
