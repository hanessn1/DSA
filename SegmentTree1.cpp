// range query sum
#include <bits/stdc++.h>
using namespace std;
class SegmentTree{
    public:
    int n;
    vector<int> tree,lazy;
    SegmentTree(int n){
        this->n=n;
        tree.resize(4*n,0);
        lazy.resize(4*n,0);
    }

    void buildTree(int i,int l,int r,vector<int> &v){
        if(l==r){
            tree[i]=v[l];
            return;
        }
        int mid=(l+r)/2;
        buildTree(2*i+1,l,mid,v);
        buildTree(2*i+2,mid+1,r,v);
        tree[i]=tree[2*i+1]+tree[2*i+2];
    }

    void pointUpdateSegmentTree(int idx,int val,int i,int l,int r){
        if(l==r){
            tree[i]=val;
            return;
        }
        int mid=(l+r)/2;
        if(idx<=mid){
            pointUpdateSegmentTree(idx,val,2*i+1,l,r);
        }else{
            pointUpdateSegmentTree(idx,val,2*i+2,l,r);
        }
        tree[i]=tree[2*i+1]+tree[2*i+2];
    }

    void rangeUpdateSegmentTree(int start,int end,int val,int i,int l,int r){
        if(lazy[i]!=0){
            tree[i]+=lazy[i]*(r-l+1);
            if(l!=r){
                lazy[2*i+1]+=lazy[i];
                lazy[2*i+2]+=lazy[i];
            }
            lazy[i]=0;
        }
        if(start>r || end<l) return;
        if(l>=start && r<=end){
            tree[i]+=val*(r-l+1);
            if(l!=r){
                lazy[2*i+1]+=val;
                lazy[2*i+2]+=val;
            }
            return;
        }
        int mid=l+(r-l)/2;
        rangeUpdateSegmentTree(start,end,val,2*i+1,l,mid);
        rangeUpdateSegmentTree(start,end,val,2*i+2,mid+1,r);
        tree[i]=tree[2*i+1]+tree[2*i+2];
    }

    // start and end are query bounds
    int query(int start,int end,int i,int l,int r){
        if(start>r || end<l) return 0;
        if(l>=start && r<=end) return tree[i];
        int mid=(l+r)/2;
        return query(start,end,2*i+1,l,mid)+query(start,end,2*i+2,mid+1,r);
    }
};
int main()
{
    vector<int> v={1,2,3,4,5};
    SegmentTree segmentTree=SegmentTree(5);
    segmentTree.buildTree(0,0,4,v);
    segmentTree.rangeUpdateSegmentTree(1,4,3,0,0,4);
    cout<<segmentTree.query(0,4,0,0,4)<<'\n';
    cout<<segmentTree.query(0,2,0,0,4)<<'\n';
    cout<<segmentTree.query(1,3,0,0,4)<<'\n';
}