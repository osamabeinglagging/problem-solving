/*

#include <iostream>
using namespace std;

int size(char string[]){
  int length = 0;
  while(string[length] != '\0'){
    length++;
  }
  return length;
}

int main(){
  int i;
  cin >> i;
  for(int x = 0; x < i; ++x){
    char string[100];
    cin >> string;
    int length = size(string);
    if(length > 10){
      cout << string[0] << (length-2) << string[length - 1] << "\n";
    }else{
      cout << string << "\n";
    }
  }
  return 0;
}

*/


#include <iostream>
#include <string>
using namespace std; // HEHE

int main(){
  int i;
  cin >> i;
  while(i--){
    string s;
    cin >> s;
    if(s.size() > 10){
      cout << s[0] << (s.size() - 2) << s[s.size() - 1] << "\n";
    }else{
      cout << s << "\n";
    }
  }
  return 0;
}
