#include<iostream>
using namespace std;

int main()
{
    int choice;
    float a,b;
    cout<<"Enter the value of a: ";
    cin>>a;
    cout<<"Enter the value of b: ";
    cin>>b;
    cout<<" 1.Addition\n 2.Subtraction\n 3.Multiplication\n  4.Division\n"<<endl;
    cout<<"Enter your choice from (1-4) "<<endl;
    cin>>choice;

    switch(choice)
    {

        case 1:
        
            cout<<"The addition of "<<a<<" and "<<b<<" is "<<a+b<<endl;
            break;
        case 2:
            cout<<"The subtraction of "<<a<<" and "<<b<<" is "<<a-b<<endl;
            break;
        case 3:
            cout<<"The multiplication of "<<a<<" and "<<b<<" is "<<a*b<<endl;
            break;
        case 4:
            cout<<"The division of "<<a<<" and "<<b<<" is "<<a/b<<endl;
            break;
        default:
            cout<<"Invalid choice"<<endl;
    }
    return 0;
}
