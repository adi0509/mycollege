sum([],0).

sum([X|Tail],Sum):-
    sum(Tail,Temp),
    Sum is Temp+X.

findsum(L):-
    sum(L,Sum),
    write("\nSum Of Given List : "),
    write(Sum).