#include<bits/stdc++.h>
using namespace std;
// if interviewer asked to implement ordered map(RB tree). this
// can be implemented as alterative. we have a binary search tree.
class Node{
    public:
    int key,value;
    Node *left,*right;

    Node(int key,int value){
        this->key=key;
        this->value=value;
        this->left=nullptr;
        this->right=nullptr;
    }
};
Node* insert(Node* root,int key,int value){
    if(root==NULL) return new Node(key,value);
    if(key==root->key){
        Node *newnode=new Node(key,value);
        newnode->left=root->left;
        newnode->right=root->right;
        return newnode;
    }
    if(key<root->key){
        return insert(root->left,key,value);
    }else{
        return insert(root->right,key,value);
    }
}
int main(){
    Node *root=insert(NULL,1,1);
    root=insert(root,2,2);
}