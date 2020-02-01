func(N, R):-
	N=0 -> R is 1;
	N>0 -> 
			N1 is N-1,
			func(N1, R1),
			R is N*R1.
fact(N):-
	func(N,R),
	write("Factorial is: "),
	write(R).