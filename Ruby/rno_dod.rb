test = gets.to_i
n = []

test.times  { |it|
  spam = gets
  arr = gets.split(" ")
  sum = 0
  arr.each {|e| sum += e.to_i }
  n << sum
}

(0...test).each { |i| puts n[i] }

