#include <iostream>

using namespace std;

bool fibon_elem(int pos, int &elem);
bool print_sequence(int pos);


int main()
{
	int pos;
	cout << "Please enter a position(-1 to quit): ";
	cin  >> pos;

	while (pos != -1)
	{
		int elem;
		if (fibon_elem(pos, elem))
		{
			cout << "element # " << pos << " is " << elem << endl;
		} else
		{
			cout << "Sorry, could not calculate element # " << pos << endl;
		}

		print_sequence(pos);

		// 循环
		cout << "Enter next position(-1 to quit): ";
		cin >> pos;
	}

	cout << "Goodbye!";

	return 1;
}


bool fibon_elem(int pos, int &elem)
{
	if (pos<=0 || pos>1024)
	{
		elem = 0;
		return false;
	}

	elem = 1;  //位置为1和2时，elem的值为1
	int n1 = 1, n2 = 1;
	for (int i=2; i<pos; i++)
	{
		elem = n1 + n2;
		n2 = n1;
		n1 = elem;
	}

	return true;
}


bool print_sequence(int pos)
{
	if (pos<=0 || pos>1024)
	{
		cout << "invalid position: " << pos << " -- cannot handle request!\n";
		return false;
	}

	cout << "The Fibonacci Sequence for " << pos << " position: \n\t";

	switch (pos)
	{
		default:
		case 2:
			cout <<  "1 ";  //注意：这里没有break;
		case 1:
			cout << "1 ";
			break;
	}

	long elem;
	long n1 = 1l, n2 = 1l;
	for (int i=2; i<pos; i++)
	{
		elem = n1 + n2;
		n2 = n1;
		n1 = elem;

		cout << elem << (!(i%10) ? "\n\t" : " ");
	}

	cout << endl;

	return true;
}
