#include<iostream>
#include<string>
using namespace std;

class Student
{
    public:
    // variables
    string Fullname;
    int rollnum;
    double semPercentage;
    string collegeName;
    int collegeCode;

    Student()
    {
        cout<<"Student class is created !!! and Iam a Student..."<<endl;
    }
    ~Student(){
        cout<<"SEE YOU SOON"<<endl;
    };
};
int main()
{
    Student Ganesh;
    string Fullname = "Mahiii";
    Ganesh.rollnum = 520;
    Ganesh.semPercentage = 8.0;
    Ganesh.collegeName = "MVGR";
    Ganesh.collegeCode = 33;
    cout<<"Name : "<<Fullname<<endl;
    cout<<"redg.no : "<<Ganesh.rollnum<<endl;
    cout<<"result : "<<Ganesh.semPercentage<<endl;
    cout<<"clg name : "<<Ganesh.collegeName<<endl;
    cout<<"clg code : "<<Ganesh.collegeCode<<endl;
    return 0;
}
