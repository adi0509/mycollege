#include<iostream>
#include "stack.cpp"

using namespace std;

int main()
{
	Stack<int> stack(3);
	cout<<endl<<stack.peek();
	stack.push(5);
	stack.push(2);
	stack.push(7);
	cout<<endl<<stack.peek();
	stack.push(10);
	cout<<endl<<stack.peek();
	cout<<endl;
	stack.arr[2]++;
	cout<<stack.arr[2];
}