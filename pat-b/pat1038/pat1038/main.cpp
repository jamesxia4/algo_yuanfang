#include <iostream>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <algorithm>
using namespace std;

int main(){
	int n=0;
	cin>>n;
	int scores[101];
	memset(scores,0,sizeof(scores));
	for(int i=0;i<n;i++){
		int tempScore=0;
		scanf("%d",&tempScore);
		scores[tempScore]++;
	}

	int k=0;
	cin>>k;
	bool flag=true;
	for(int i=0;i<k;i++){
		int query=0;
		scanf("%d",&query);
		if(flag){
			flag=false;
		}
		else{
			printf(" ");
		}
		printf("%d",scores[query]);
	}
	return 0;
}