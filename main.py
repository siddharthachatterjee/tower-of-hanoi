def move(n, source, target, aux):
  if n > 0:
    move(n - 1, source, aux, target)
    print("Move disk {} from {} to {}".format(n, source, target))
    move(n - 1, aux, target, src)

n = int(input())
move(n, 'A', 'C', 'B')
