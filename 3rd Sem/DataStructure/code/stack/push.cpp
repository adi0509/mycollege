
namespace DS
{


	template<typename Stack, typename dataType>//Stack-> array or class with overloaded []
	int push(Stack arr, int size, int Top, dataType data)
	{
		if( Top >= size-1)//if overflow
			return Top;

		arr[++Top] = data;//insert value in stack
		return Top;//return new Top
	}



}