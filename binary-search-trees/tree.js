var Tree = function(){
  this.root = null;
}

var Node = function(val){
  this.val = val;
  this.left = null;
  this.right = null;
}

Tree.prototype.bfs = function(){
  var queue = [this.root];
  var results = [];

  while(queue.length){
    var current = queue.shift();
    results.push(current.val);
    if(current.left) queue.push(current.left);
    if(current.right) queue.push(current.right);
  }

  return results;
}

Tree.prototype.dfsPreOrder = function(node, results){
  results.push(node.val);
  if(node.left) this.dfsPreOrder(node.left, results);
  if(node.right) this.dfsPreOrder(node.right, results);

  return results;
}

var tree = new Tree();
tree.root = new Node(8);
tree.root.left = new Node(3);
tree.root.right = new Node(10);
tree.root.left.left = new Node(1);
tree.root.left.right = new Node(4);

// console.log(tree.dfsPreOrder(tree.root, []));

// Tree.prototype.dfsPre = function(node, arr, search){
//   if(!node) return;
//   // console.log(node.val, search);
//   if(node.val === search) return node;
//
//   var result = arr;
//   result.push(node.val);
//   this.dfsPre(node.left, result, search);
//   this.dfsPre(node.right, result, search);
//
//   return result;
// }
Tree.prototype.dfs = function(node, search){
  if(!node) return;
  if(node.val === search) return node;

  if(node.val > search && node.left){
    return this.dfs(node.left, search);
  }
  if(node.val < search && node.right){
    return this.dfs(node.right, search);
  }
  return "Not in tree";
}

console.log(tree.dfs(tree.root, 11));


//
// Tree.prototype.dfsIn = function(node, arr, search){
//   if(!node) return;
//   // console.log(node.val, search);
//   // if(node.val === search) return node;
//
//   var result = arr;
//   this.dfsPre(node.left, result, search);
//   result.push(node.val);
//   this.dfsPre(node.right, result, search);
//
//   return result;
// }
//
// Tree.prototype.dfsPost = function(node, arr, search){
//   if(!node) return;
//   // console.log(node.val, search);
//   // if(node.val === search) return node;
//
//   var result = arr;
//   this.dfsPre(node.left, result, search);
//   this.dfsPre(node.right, result, search);
//   result.push(node.val);
//
//   return result;
// }
//
//
//
// // console.log(tree.bfs());
// console.log(tree.dfsPre(tree.root, 4));
// // console.log(tree.dfsIn(tree.root, [], 4));
// // console.log(tree.dfsPost(tree.root, [], 4));
