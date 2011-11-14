test = gets.to_i
n = []
test.times  { |i| n[i] = gets.to_i }

test.times do |i|
  case n[i]
  when 0, 1
    puts "0 1"
  when 2
    puts "0 2"
  when 3
    puts "0 6"
  when 4
    puts "2 4"
  when 5, 6, 8
    puts "2 0"
   when 7
    puts "4 0"
  when 9
    puts "8 0"
  else
    puts "0 0"
  end  
end

