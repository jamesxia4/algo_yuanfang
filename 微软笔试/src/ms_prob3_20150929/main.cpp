#include <iostream>
#include <map>

using namespace std;

int main()
{
    int n=0;
    cin>>n;
    int * array=new int[n];

    for(int i=0;i<n;i++){
        cin>>array[i];
    }

    map<int,int> fibMap;
    map<int,int>::iterator fibMap_Iter;
    fibMap.insert(pair<int,int>(1,0));
    fibMap.insert(pair<int,int>(2,0));
    fibMap.insert(pair<int,int>(3,0));
    fibMap.insert(pair<int,int>(5,0));
    fibMap.insert(pair<int,int>(8,0));
    fibMap.insert(pair<int,int>(13,0));
    fibMap.insert(pair<int,int>(21,0));
    fibMap.insert(pair<int,int>(34,0));
    fibMap.insert(pair<int,int>(55,0));
    fibMap.insert(pair<int,int>(89,0));
    fibMap.insert(pair<int,int>(144,0));
    fibMap.insert(pair<int,int>(233,0));
    fibMap.insert(pair<int,int>(377,0));
    fibMap.insert(pair<int,int>(610,0));
    fibMap.insert(pair<int,int>(987,0));
    fibMap.insert(pair<int,int>(1597,0));
    fibMap.insert(pair<int,int>(2584,0));
    fibMap.insert(pair<int,int>(4181,0));
    fibMap.insert(pair<int,int>(6765,0));
    fibMap.insert(pair<int,int>(10946,0));
    fibMap.insert(pair<int,int>(17711,0));
    fibMap.insert(pair<int,int>(28657,0));
    fibMap.insert(pair<int,int>(46368,0));
    fibMap.insert(pair<int,int>(75025,0));

    for(int i=0;i<n;i++){
        fibMap_Iter=fibMap.find(array[i]);
        if(fibMap_Iter==fibMap.end()){
            continue;
        }
        else{
            fibMap_Iter->second=fibMap_Iter->second+1;
        }
    }

    int sum=0;
    sum=sum+fibMap.begin()->second;
    sum=sum+(fibMap.begin()->second)*(fibMap.begin()->second-1)/2;
    int next=(fibMap.begin()->second)*(fibMap.begin()->second-1)/2;
    for(fibMap_Iter=++(fibMap.begin());fibMap_Iter!=fibMap.end();fibMap_Iter++){
        sum=sum+next*fibMap_Iter->second;
    }

    cout<<sum%1000000007<<endl;
    return 0;
}
