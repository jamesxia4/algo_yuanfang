#include <iostream>
#include <cstring>

using namespace std;

int main(){
	int n=0;
	cin>>n;
	int group[100005];
	memset(group,0,sizeof(group));
	for(int i=0;i<n;i++){
		int groupN=0;
		int score=0;
		scanf("%d %d",&groupN,&score);
		group[groupN]+=score;
	}
	int max=0;
	int maxN=0;
	for(int i=0;i<100005;i++){
		if(group[i]>max){
			max=group[i];
			maxN=i;
		}
	}
	printf("%d %d\n",maxN,max);
	return 0;
}