#include <iostream>
#include <cmath>
using namespace std;

int main(){
  int a;
  for(int r = -2; r < 3; ++r){
    for(int c = -2; c < 3; ++c){
      cin >> a;
      if(a == 1){
        cout << (abs(r) + abs(c)) << "\n";
        return 0;
      }
    }
  }
  return 0;
}
