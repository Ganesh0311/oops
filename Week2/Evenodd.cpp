#include<iostream>
using namespace std;
void check(int);

int main()
{
    int a;
    cout<<"Enter the value of a: ";
    cin>>a;
    check(a);
}
void check(int (a))
{
    if(a%2==0)
    {
        cout<<"The given value "<<a<<" is even"<<endl;
    }
    else
    {
        cout<<"The given value "<<a<<" is odd"<<endl;
    }
}
