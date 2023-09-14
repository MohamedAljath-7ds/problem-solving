class V {
public boolean ispalindrome(String w){
char[] c = w.toCharArray();
int s = 0;
int e = w.length()-1;
while(s<e){
if(c[s]!= c[e]){
return false;
}
s++;
e--;
}
return true;
}
}


class T {
public static void main(String[] args){
V s = new V();
boolean e  = s.ispalindrome("sister");
System.out.println(e);
}
}