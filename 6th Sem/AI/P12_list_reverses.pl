findreverse([], T, T).

findreverse(L, T, R):-
	L=[H1|T1],
	findreverse(T1,[H1|T], R)

reverse(L, R):-
	findreverse(L, [], R),