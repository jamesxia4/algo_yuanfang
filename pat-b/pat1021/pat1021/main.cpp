#include <iostream>
#include <cstdio>
#include <string>
#include <cstring>
#include <cstdlib>

using namespace std;
int main(){
	char input[1005];
	scanf("%s",&input);
	int length=strlen(input);
	int count[10];
	memset(count,0,sizeof(count));
	//0:48
	for(int i=0;i<length;i++){
		count[int(input[i])-48]++;
	}
	for(int i=0;i<10;i++){
		if(count[i]!=0){
			cout<<i<<":"<<count[i]<<endl;
		}
	}
	return 0;
}