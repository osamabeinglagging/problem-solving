#include <iostream>
using namespace std;

int main(){
  int i, s = 0;
  char str[4];
  cin >> i;
  while(i--){
    cin >> str;
    if(str[1] == '+'){
      s++;
    }else{
      s--;
    }
  }
  cout << s << "\n";
  return 0;
}
