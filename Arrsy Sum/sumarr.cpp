#include<iostream>
using namespace std;
int main(){
    int array[] = {10, 20, 30, 40, 50};
    int sum = 0;
    cout << "Sum of Array:- \n" << "{";
    for (int i = 0; i <= 4; i++) 
    {
        int arraysum = array[i];
        sum = sum + arraysum;
        cout << arraysum << ",";
    }
    cout << "} = " << sum;
    return 0 ;
}