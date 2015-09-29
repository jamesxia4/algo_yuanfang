#include <iostream>
#include <cstdio>
#include <cmath>
#include <string>
#include <cctype>
using namespace std;

int main(){
	char *s1=new char[60];
	char *s2=new char[60];
	char *s3=new char[60];
	char *s4=new char[60];
	scanf("%s%s%s%s",s1,s2,s3,s4); //注意这里s1s2s3s4是指针所以不用再传引用了

	int maxLen1=min(sizeof(s1),sizeof(s2));
	int maxLen2=min(sizeof(s3),sizeof(s4));

	char cDay=' ';
	string day="";
	int tempI=0;
	char hour=' ';
	int minute=0;
	for(int i=0;i<maxLen1;i++){
		if((s1[i]==s2[i]))
		{
			cDay=s1[i];
			tempI=i;
		}
	}
	if(cDay=='A'){
		day="MON";
	}
	else if(cDay=='B'){
		day="TUE";
	}
	else if(cDay=='C'){
		day="WED";
	}
	else if(cDay=='D'){
		day="THU";
	}
	else if(cDay=='E'){
		day="FRI";
	}
	else if(cDay=='F'){
		day="SAT";
	}
	else if(cDay=='G'){
		day="SUN";
	}
	else{
		day="ERROR";
	}
	
	//for(int i=tempI;i<maxLen1;i++)
	//{
	//	if((s1[i]==s2[i]))
	//	{
	//		cDay=s1[i];
	//		tempI=i;
	//	}
	//}

	for(int j=0;j<maxLen2;j++)
	{
		if((s3[j]==s4[j]) && (isupper(s3[j]) || islower(s3[j])) && (isupper(s4[j]) || islower(s4[j])))
		{
			minute=j;
		}
	}
	cout<<day<<endl;
	cout<<minute<<endl;

	return 0;
}