
namespace DS
{

	template<typename Stack, typename dataType>
	void peek(Stack arr, int Top, dataType data)//Stack-> array or class with overloaded []
	{
		data = arr[Top];//store Top-most element in Stack
	}
}