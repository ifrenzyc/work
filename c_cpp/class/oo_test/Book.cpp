#include "Book.h"

Book::Book(const string& title, const string& author)
    : _title(title), _author(author)
{
    cout << "Book::Book(" << _title << ", " << _author << ") constructor!" << endl;
}

Book::~Book()
{
    cout << "Book::~Book() destructor!" << endl;
}

void Book::print() const
{
    cout << "Book::print() -- I am a Book object!\n"
        << "My title is: " << _title << "\n"
        << "My author is: " << _author << endl;
}

// const string& Book::title() const
// {
    // return _title;
// }

// const string& Book::author() const
// {
    // return _author;
// }
