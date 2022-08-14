package org.example.lesson7


/**
 *  " "
 *  ' '
 *  """ """
 *  / /
 *  $/ /$
 */

def name = "Sasha"
def number = "$name: +79159169175"

char m = 'm'

println number[1]
println number[-1]
println number[7..(number.length()-1)]
println name * 5
println number - '915'


