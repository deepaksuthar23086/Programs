#include <iostream>
using namespace std;

int main(){
    
    char restart = 'y';
    int number;

    while (restart == 'y')
    {
        cout << "Enter Table Number: ";
        cin >> number;

        for(int i=1; i<=10; i++)
        {
        int table = i * number;
        cout << number << " * " << i << " = " << table << endl;

        }
        cout << "Next Table y/n ;  ";
        cin >> restart;

    }      
    return 0;
}