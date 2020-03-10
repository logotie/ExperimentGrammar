
# ExperimentGrammar
An experimental test language I am working on.  

Just something I am doing in my spare time.

First goal is to get it working.
I'm using ANTLR 4 to define the grammar.

There's going to be a lot that can be improved on, I'm reading and learning as I am going.

A language run on the JVM.

I want to get it generating bytecode using Java.

Then consume the bytecode with an interpreter/compiler written in C++.

# Features I am working on (ranked by importance): 
1. String assignment
2. Number assignment
3. Arithmetic expressions.
4. for loops
5. print expression
6. if statement
7. array

```
str a="16"

num b=4

c="test"	#able to change type

d=[1,2,3,4,5]
e=[6,7,8]

g=d+e #	[1,2,3,4,5,6,7,8]

f=2'+c	#"2test"	The ' character signifies that 2 will be converted into string.

f=4 #mutable
f:4 #is now immutable

if a<3 then{

}

for 1..100 do{

print(i) #will print 1234
println(i)#will print 1,2,3,4 each on a new line

}

