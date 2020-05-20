noun([dog|X],X).

noun([cat|X],X).

noun([mouse|X],X).

verb([ate|X],X).

verb([chases|X],X).

adjective([big|X],X).

adjective([brown|X],X).

adjective([lazy|X],X).

determiner([the|X],X):-!.

nounphrase(NP,X):- determiner(NP,R),
				noun(R,X).

nounphrase(NP,X):- determiner(NP,R),
				adjective(R,S2),
				noun(S2,X).

verbphrase(VP,X):- verb(VP,R),
				nounphrase(R,X).

sentence(I,O):- nounphrase(I,R),
				verbphrase(R,O).