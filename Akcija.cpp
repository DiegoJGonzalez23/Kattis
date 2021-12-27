
#include <iostream>
#include <vector>
#include <set>
#include <algorithm>
#include <queue>

using namespace std;



int main(){

    priority_queue<int> pq;

    int numberbooks;
    cin >> numberbooks;

    for (int i = 0; i < numberbooks; i++) {
        int price;
        cin >> price;
        pq.push(price);
    }
    int sum = 0;
    for (int i = 0; i < (numberbooks / 3); i++) {
        int a = pq.top();
        sum += a;
        pq.pop();
        int b = pq.top();
         sum += b;
        pq.pop();
        int c = pq.top();
        sum += c;
        pq.pop();
        int takeout = min({ a,b,c });
        sum -= takeout;

   
    }
    while (!pq.empty()) {
        sum+= pq.top();
        pq.pop();
    }
    
    
    
    cout << sum;




    }


    



