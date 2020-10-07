#include <iostream>
using namespace std;

int main() 
{
  int n,i,j,flag;
  cin>>n;
  int arr[n];
  for(i=0;i<n;i++)
    cin>>arr[i];
  for(i=0;i<n;i++)
  {
    flag=0;
    for(j=i;j<n;j++)
    {
      if(arr[i]==arr[j] && i!=j)
      {
        flag=1;
        break;
      }
    }
    if(flag==1)
      cout<<arr[i]<<" ";
    }
    return 0;
}