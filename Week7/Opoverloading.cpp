#include <iostream>
using namespace std;

class Count {
   public:
    int value;

   public:
     Count() : value(){
     cin>>value;
    }
    void operator -- () {
       --value;
    }
    void display() {
        cout << "Count: " << value << endl;
    }
};

int main() {
    Count obj1;
    --obj1;
    obj1.display();
    return 0;
}
