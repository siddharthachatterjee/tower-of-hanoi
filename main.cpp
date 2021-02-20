#include <iostream>

void move(int n, char source, char target, char auxiliary) {
  if (n > 0) {
    move(n - 1, source, auxiliary, target);
    std::cout << "Move disk " << n << " from " << source << " to " << target << "\n";
    move(n - 1, auxiliary, target, source);
  }
}

int main() {
  int n; std::cin >> n;
  move(n, 'A', 'C', 'B');
}
