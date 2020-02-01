func(F, S, N):-
	N=0 ->write(S);
	N>0 ->
	F1 is S,
	S1 is S+F,
	N1 is N-1,
	func(F1,S1,N1).

fibo(N):-
	N<1 ->  write("Please enter a number greater than '0'");
	N=1 ->  write("1");
	N=2 ->  write("1");
	N>2 ->  N1 is N-2,
			func(1,1,N1).

