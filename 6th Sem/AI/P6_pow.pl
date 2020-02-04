pow(N, P, A):-
	( P=0 -> A is 1 );
	( P>0 -> P1 is P-1,
			 pow(N, P1, A1),
			 A is A1*N
				);
	( P<0 -> P1 is P+1,
			 pow(N, P1, A1),
			 A is A1/N).