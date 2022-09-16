#include <iostream>
using namespace std;

int main(){
    
    int restart = 1;
    int number;

    while (restart == 1)
    {
        cout << "Enter Table Number: ";
        cin >> number;

        for(int i=1; i<=10; i++)
        {
        int table = i * number;
        cout << number << " * " << i << " = " << table << endl;

        }
        cout << "Next Table 1/0 ";
        cin >> restart;

    }      
    return 0;
}