findreverse([], T, T).

findreverse([H1|T1], T, R):-
	findreverse(T1, [H1|T], R).

reverse(L,R):-
	findreverse(L, [], R).

is_equal([], []):- true.

is_equal([H1|_], [H2|_]):- false.

is_equal([H1|T1], [H1|T2]):-
	is_equal(T1, T2).

is_plain(L):-
	reverse(L, R),
	is_equal(L,R).