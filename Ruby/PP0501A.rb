def nwd(a, b)
  a = Integer(a)
  b = Integer(b)
  while a > 0
    a, b = b % a, a
  end
  return b
end

test = gets.to_i
n=[]
test.times  { |i| n[i] = gets.split(" ") }
test.times { |i| puts nwd(n[i][0], n[i][1]) }


