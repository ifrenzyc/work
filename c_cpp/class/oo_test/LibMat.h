#ifndef __LIBMAT_H__
#define __LIBMAT_H__

#include <iostream>
#include <string>

using namespace std;

class LibMat
{
public:
    LibMat();

    virtual ~LibMat();

    virtual void print() const;

private:
};

#endif