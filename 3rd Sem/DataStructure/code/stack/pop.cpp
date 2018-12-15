
namespace DS
{

	
	template<typename Stack, typename dataType>//Stack-> array or class with overloaded []
	int pop(Stack arr, int Top, dataType &data)
	{
		if(Top <= -1)//if underflow
			return Top;

		data = arr[Top--];//store poped element in data
		return Top;//return new Top
	}

}