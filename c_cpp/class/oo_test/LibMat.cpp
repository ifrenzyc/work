#include "LibMat.h"

LibMat::LibMat()
{
    cout << "LibMat::LibMat() default constructor!" << endl;
}

LibMat::~LibMat()
{
    cout << "LibMat::~LibMat() destructor!" << endl;
}

void LibMat::print() const
{
    cout << "LibMat::print() -- I am a LibMat object!" << endl;
}