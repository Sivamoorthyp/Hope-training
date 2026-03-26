class Solution {
    public boolean isRobotBounded(String instructions) {
        int dir=0;
        int x=0,y=0;
        for(int i=0;i<instructions.length();i++){
            char ch=instructions.charAt(i);
            if(ch=='L'){
                dir=(dir+1)%4;
            }
            else if(ch=='R'){
                dir=(dir+3)%4;
            }
            else{
                if(dir==0)x++;
                else if(dir==1)y--;
                else if(dir==2)x--;
                else y++;
            }
        }
        if(x==0 && y==0 || dir!=0)return true;
return false;
    }
}