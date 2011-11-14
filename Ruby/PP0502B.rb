test = gets.to_i
n = []
test.times  { |i| n[i] = gets.split(" ") }

test.times do |i|
  n[i].slice!(0)
  n[i].reverse!
  n[i].each { |e| print "#{e} " }
  puts
end

