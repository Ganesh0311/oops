#include<iostream>
using namespace std;

class over{
    public :
        int mul(int a,int b){
            int value = a*b;
            return value;
        }
        float mul(float a,float b){
            float value = a*b;
            return value;
        }
        int mul(float a,int b,float c){
            float value = a*b*c;
            return value;
        }
};
int main()
{
    over obj;
       cout<<"Int multiplication is : "<<obj.mul(88,7)<<endl;
       cout<<"Float multiplication is : "<<obj.mul(6.0f,2.0f)<<endl;
       cout<<"Three parameters multiplication is : "<<obj.mul(2.0f,9,6.0f)<<endl;
    return 0;
}
