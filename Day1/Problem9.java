

public class Problem9 {
        public boolean isPalindrome(int x) {
        int tmp;
        int y=0;
        int initialX = x;

        if(x==0){
            return true;
        }
        else if(x<0){
            return false;
        }
        else if(x%10==0){
            return false;
        }
        else{
            while(true){
                tmp = x%10;
                x = x/10;
                y = y*10 + tmp; 
                if(x==0){
                    if(y==initialX){
                        return true;
                    }
                    break;
                }
            }

        }

    return false;
        
    }
}


