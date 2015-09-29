#include <iostream>
#include <cstdio>
#include <cstring>
#include <string>
#include <cstdlib>

using namespace std;

int main(){
	int c1=0;
	int c2=0;
	cin>>c1>>c2;
	double time=(c2-c1)/100.0;

	int hour=time/3600;
	if(hour<10){
		cout<<0<<hour<<":";
	}
	else{
		cout<<hour<<":";
	}

	int minute=(time-hour*3600)/60;
	if(minute<10){
		cout<<0<<minute<<":";
	}
	else{
		cout<<minute<<":";
	}

	double second=time-hour*3600-minute*60;
	int second_part1=int(second);
	double second_part2=second-second_part1;
	if(second_part2>=0.5){
		second_part1++;
	}

	if(second_part1<10){
		cout<<0<<second_part1<<endl;;
	}
	else{
		cout<<second_part1<<endl;
	}

	return 0;
}