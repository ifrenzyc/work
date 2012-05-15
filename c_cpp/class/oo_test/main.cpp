#include "LibMat.h"

void print(LibMat &mat)
{
	mat.print();
}

int main()
{
	LibMat mat;
	print(mat);
    
	getchar();

    return 0;
}