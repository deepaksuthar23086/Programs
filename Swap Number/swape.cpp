#include<iostream>

using namespace std;


void swap(int *number_first, int *number_second){
    int temp;
    temp = *number_first;
    *number_first = *number_second;
    *number_second = temp;        
}    



int main(){

    char continueMoreSwap = 'y';

    while(continueMoreSwap == 'y') {

        int first_number, second_number;
        cout << "Enter first number: " ;
        cin >> first_number;
        cout << "Enter second number: " ;
        cin >> second_number;
        cout << "Before swap: " << "first number = " << first_number << " second number = " << second_number << endl ;
        swap(&first_number, &second_number);
        cout << "After swap: "<< "first number = " << first_number << " " << "second number = " << second_number << endl ;


        cout << "Want to swap more numbers y/n";
        cin >> continueMoreSwap;

    }

    return 0;

}




