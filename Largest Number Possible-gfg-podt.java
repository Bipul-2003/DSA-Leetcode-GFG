class Solution{
    static String findLargest(int N, int S){
        // code here
        if (S == 0)
            return (N == 1 ? "0" : "-1");
        if (S > 9*N)
            return "-1";
        String res="";
         
        for (int i=0; i<N; i++)
        {
            if (S >= 9)
            {
                res+=String.valueOf(9); 
                S -= 9;
            }
            else
            {
               res+=String.valueOf(S); 
                S = 0;
            }
        } return res;
     
    }
}
