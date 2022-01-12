#include <bits/stdc++.h>
using ll = long long;
using namespace std;

void solve(){
    long long int  n,q;
    cin>>n;
    long long int arr[n];
    for(long long int i=0; i<n; i++)
        cin>>arr[i];
    cin>>q;
    for(long long int i=0; i<q; i++){
        long long int l,r;
        cin>>l>>r;
        if(l==r){
            cout<<-1;
            continue;
        } 
        long long int a=-1, b=-1;
        bool z=false, x=false;
        // for(long long int i=0, j=n-1; i<n; i++, j--){
        //     if(arr[i]>=r || )
        //     if(z==false && arr[i]<=r && arr[i]>=l){
        //         a=i;
        //         z=true;
        //     }
        //     if(x==false && arr[j]<=r && arr[j]>=l){
        //         b=j;
        //         x=true;
        //     }
        // }    
        for(int i=0; i<=n-1; i++){
            if(arr[i]>=l)
                if(a==-1)
                    a=i;

            else if(arr[i]>r){
                b=i-1;
                break;
            }
        }
        if(a==-1 || b==-1 || a==b){
            cout<<-1<<endl;
            continue;
        }
        cout<<abs(arr[b]-arr[a]);
        cout<<endl;
    }
}

int main()
{    
    // long long int t;
    // cin>>t;
    // while(t--)
        solve();
    return 0;
}