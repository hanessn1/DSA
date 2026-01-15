// range maximum index query
#include<bits/stdc++.h>
using namespace std;
class SegmentTree{
    public:
    int sz;
    vector<int> tree;
    SegmentTree(vector<int> &nums){
        this->sz=nums.size();
        tree.resize(4*sz,-1);
        buildSegmentTree(0,0,sz-1,nums);
    }

    void buildSegmentTree(int i,int l,int r,vector<int> &nums){
        if(l==r){
            tree[i]=l;
            return;
        }
        int mid=l+(r-l)/2;
        buildSegmentTree(2*i+1,l,mid,nums);
        buildSegmentTree(2*i+2,mid+1,r,nums);
        int idx=-1,maxi=INT_MIN;
        if(tree[2*i+1]>maxi){
            maxi=max(maxi,tree[2*i+1]);
            idx=2*i+1;
        }
        if(tree[2*i+2]>maxi){
            maxi=max(maxi,tree[2*i+2]);
            idx=2*i+2;
        }
        tree[i]=tree[idx];
    }

    int query(int start,int end,int i,int l,int r){
        if(r<start || l>end) return -1;
        if(l>=start && r<=end) return i;
        int mid=l+(r-l)/2;
        int leftidx=query(start,end,2*i+1,l,mid);
        int rightidx=query(start,end,2*i+2,mid+1,r);
        int maxi=INT_MIN,idx=-1;
        if(leftidx!=-1 && tree[leftidx]>maxi){
            maxi=max(maxi,tree[leftidx]);
            idx=leftidx;
        }
        if(rightidx!=-1 && tree[rightidx]>maxi){
            maxi=max(maxi,tree[rightidx]);
            idx=rightidx;
        }
        return tree[idx];
    }
};
int main(){
    vector<int> v={1,2,3,4};
    SegmentTree segmentTree=SegmentTree(v);
    cout<<segmentTree.query(1,1,0,0,3)<<'\n';
    cout<<segmentTree.query(1,3,0,0,3)<<'\n';
}