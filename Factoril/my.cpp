
#include <iostream>
using namespace std;

int main() {
    int n;
    long factorial = 1;
    int confrom =1; 
      while (/* condition */confrom == 1)
    {
      
      cout << "Enter a positive integer: ";
    cin >> n;
  
    if (n < 0)
        cout << "Error! Factorial of a negative number doesn't exist.";
    else {
        for(int i = 1; i <= n; ++i) {
            factorial *= i;
        }
        cout << "Factorial of " << n << " = " << factorial;    
    }
    
    cout << "\n Restart = 1/0 ";
    cin >> confrom;
    
    } 
  
    return 0;
}