#ifndef __BOOK_H__
#define __BOOK_H__

#include "LibMat.h"
#include <iostream>
#include <string>

using namespace std;

class Book : public LibMat
{
public:
    Book(const string &title, const string &author);

    virtual ~Book();

    virtual void print() const;

    const string& title() const;

    const string& author() const;

protected:
    string _title;
    string _author;
};

#endif
