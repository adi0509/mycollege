findnum(X, []):-
	write("\nNumber not found").
findnum(X, [X|Tail]):-
	write("\nNumber found").
findnum(X, [Y|Tail]):-
	findnum(X, Tail).
memb(X, L):-
	findnum(X,L).