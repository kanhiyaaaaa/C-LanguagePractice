#include<iostream>
#include<stack>
using namespace std;
class Stack {
    int size;
    int *arr;
    int top;
public:
Stack(int size){
    this->size=size;
    arr=new int[size];
    top=-1;
}
void push(int element){
    if(size-top>1){
        top++;
        arr[top]=element;
        
    }
    else
    cout<<"stack is overflow"<<endl;
}
void pop(){
    if(top>=0){
        top--;
    }
    else
    cout<<"stack is underflow";

}
int peek(){
   if(top>=0){
    return arr[top];
   }
   else{
    cout<<"stack is empty"<<endl;
    return -1;
   }
}
bool isempty(){
    if(top==-1){
        return true;
    }
    else
    return false;
}
};
int main(){
    
    Stack st(5);
    
    st.push(20);
    st.push(44);
    st.push(22);
    st.push(55);
    st.push(24);
    cout<<st.peek()<<endl;
    st.pop();
    cout<<st.peek()<<endl;
     st.pop();
    cout<<st.peek()<<endl;
     st.pop();
    cout<<st.peek()<<endl;
     st.pop();
    cout<<st.peek()<<endl;

}