const readline = require("readline");

function move(n, source, target, aux) {
  if (n > 0) {
    move(n - 1, source, aux, target);
    console.log(`Move disk ${n} from ${source} to ${target}`);
    move(n - 1, aux, target, source);
  }
}

let n = readline();
move(n, 'A', 'C', 'B');
