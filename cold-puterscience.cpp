// Diego Gonzalez code 12.25.21
#include <iostream>
using namespace std;

int main()
{
    int weathers;
    int below = 0;
    cin >> weathers;
    int weather;
    for (int i = 0; i < weathers; i++) {

       
        cin >> weather;
        if (weather < 0) {
            below++;
        }


    }
    cout << below;


}


