
# ExperimentGrammar
An experimental test language I am working on.  

Just something I am doing in my spare time.

First goal is to get it working.
I'm using ANTLR 4 to define the grammar.

There's going to be a lot that can be improved on, I'm reading and learning as I am going.

A language run on the JVM.

```
string a=16

num b=4

c="test"

d=[1,2,3,4,5]
e=[6,7,8]

f=1+c' #"1test".  The ' character signifies that the num will be converted to string

g=d+e; #[1,2,3,4,5,6,7,8]

f=4 #mutable
f:4 #is now immutable

if a<3 then{

}

for 1..100 do{

print(i) #will print 1234
println(i)#will print 1,2,3,4 each on a new line

}

