func(M, N, R, A):-
    R=0 -> A is 1;
    R>0 ->
           T1 is mod(N, R),
           T2 is mod(M, R),
          (  T1=0 , T2=0-> A is R;
             R1 is R-1,
             func(M, N,R1, A)).

gcd(M, N):-

    (   M>=N -> func(M, N, N, A);
        M<N -> func(M, N, M, A)),
    write(A).
