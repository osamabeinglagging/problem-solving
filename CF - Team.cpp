#include <iostream>
using namespace std;

int main(){
  int i, a, b, c, s=0;
  cin >> i;
  while(i--){
    cin >> a >> b >> c;
    if(a+b+c > 1){
      s++;
    }
  }
  cout << s << "\n";
  return 0;
}
