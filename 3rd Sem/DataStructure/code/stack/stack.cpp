#include<iostream>

#include"push.cpp"
#include"pop.cpp"
#include"peek.cpp"

template<typename dataType>
class Stack
{
public:
	dataType* arr;
	int size;
	int Top;

public:
	Stack() {arr = NULL;};
	Stack(int s);
	void init(int s);
	void push(dataType data);
	dataType peek();
	dataType pop();
};

template<typename dataType>
void Stack<dataType>::init(int s)
{
	arr = new dataType[s];
	Top = -1;
	size = s;
}

template<typename dataType>
Stack<dataType>::Stack(int s)
{
	init(s);
}

template<typename dataType>
void Stack<dataType>::push(dataType data)
{
	int newTop = DS::push(arr, size, Top, data );
	if(newTop==Top)
		std::cout<<"Overflow!";
	else
		Top = newTop;
}

template<typename dataType>
dataType Stack<dataType>::peek()
{
	dataType data(0);
	if(arr == NULL)
		return data;
	DS::peek(arr, Top, data);
	return data;
}


template<typename dataType>
dataType Stack<dataType>::pop()
{
	dataType data(0);
	if(arr == NULL)
		return data;
	int newTop = DS::pop(arr, Top, data);
	if(newTop == Top)
		std::cout<<"underflow!";
	else
		Top = newTop;
	return data;
}

