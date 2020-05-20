edge(p,q).

edge(q,r).

edge(r,s).

edge(s,t).

path(X,Y) :- edge(X,Y).

path(X,Y) :- edge(X,Z),
			path(Z,Y).