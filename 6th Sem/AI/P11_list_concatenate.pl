conc([],L2,L2).

conc(L1, L2, L3):-
	L1=[H1|T1],
	conc(T1, L2, T3),
	L3= [H1|T3].