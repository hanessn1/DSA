#include <bits/stdc++.h>
using namespace std;
class TrieNode{
    public:
    bool isEndOfWord;
    TrieNode *children[26];

    TrieNode(){
        isEndOfWord=false;
        for(int i=0;i<26;i++){
            this->children[i]=NULL;
        }
    }
};
class Trie{
    TrieNode *root;
    Trie() {
        root=new TrieNode();
    }
    
    void insert(string word) {
        TrieNode *crawl=root;
        for(int i=0;i<word.size();i++){
            int idx=word[i]-'a';
            if(crawl->children[idx]==NULL){
                crawl->children[idx]=new TrieNode();
            }
            crawl=crawl->children[idx];
        }
        crawl->isEndOfWord=true;
    }
    
    bool search(string word) {
        TrieNode *crawl=root;
        for(int i=0;i<word.size();i++){
            int idx=word[i]-'a';
            if(crawl->children[idx]==NULL) return 0;
            crawl=crawl->children[idx];
        }
        return crawl->isEndOfWord==true;
    }
    
    bool startsWith(string prefix) {
        TrieNode *crawl=root;
        for(int i=0;i<prefix.size();i++){
            int idx=prefix[i]-'a';
            if(crawl->children[idx]==NULL) return 0;
            crawl=crawl->children[idx];
        }
        return 1;
    }
};
int main(){

}