// Diego Gonzalez code 12.25.21
#include <iostream>
using namespace std;

int main()
{
    string person;
    string doc;

    cin >> person >> doc;

    if (person.size() >= doc.size()) {
        cout << "go";
    }
    else {
        cout << "no";
    }
    return 0;


}


