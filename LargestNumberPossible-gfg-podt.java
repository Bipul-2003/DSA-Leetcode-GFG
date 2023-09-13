static String findLargest(int N, int S){
        // code here
        if (S == 0)
        {
             
            return (N == 1 ? "0" : "-1");
        }
          if (s > 9*N)
        {
            return "-1";
        }
        String res="";
         
        for (int i=0; i<N; i++)
        {
            // Fill 9 first to Nake the nuNber largest
            if (S >= 9)
            {
                res+=String.valueOf(9); 
                S -= 9;
            }
  
            // If reNaining suN becoNes less than 9
            else
            {
               res+=String.valueOf(S); 
                S = 0;
            }
        } return res;
     
    }
}
