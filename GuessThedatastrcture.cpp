
#include <iostream>
#include <stack>
#include <queue>

using namespace std;



int main()


{
    int n;
    while (cin >> n) {
        stack<int> st;
        queue<int> q;
        priority_queue<int> pq;




        bool isq = true;
        bool isst = true;
        bool ispq = true;
        int action;
        int number;
      
        for (int i = 0; i < n; i++) {


            cin >> action >> number;

            if (action == 1) {
                st.push(number);
                q.push(number);
                pq.push(number);
            }

            else {

                // Check if it fits stack standards
                int check;
                if (st.empty()) {
                    isst = false;
                }
                else {


                    check = st.top();
                    if (number != check) {
                        isst = false;
                        st.pop();
                    }

                    else {
                        st.pop();
                    }
                }


                int check1;
                if (q.empty()) {
                    isq = false;
                }
                else {


                    check1 = q.front();
                    if (number != check1) {
                        isq = false;
                        q.pop();
                    }

                    else {
                        q.pop();
                    }
                }

                int check2;
                if (pq.empty()) {
                    ispq = false;
                }
                else {


                    check2 = pq.top();
                    if (number != check2) {
                        ispq = false;
                        pq.pop();
                    }

                    else {
                        pq.pop();
                    }
                }







            }



        }


        if (!isq && !isst && !ispq) {
            cout << "impossible" << endl;
        }
        else if (!isq && !isst && ispq) {
            cout << "priority queue" << endl;
        }
        else if (!isq && isst && !ispq) {
            cout << "stack" << endl;
        }
        else if (isq && !isst && !ispq) {
            cout << "queue" << endl;
        }
        else {
            cout << "not sure" << endl;
        }





    }






}
