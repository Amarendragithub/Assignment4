class DuplicateCharecters
 {
   public static void main(String[] args)
    {
      String s1 = "your account opening experience";
      char[] arr = s1.toCharArray();
      
      System.out.println("The string is:" + s1);

      System.out.print("Duplicate Characters : ");

      for (int i = 0; i < s1.length(); i++)
       {
         for (int j = i + 1; j < s1.length(); j++)
          {
            if (arr[i] == arr[j])
             {
               System.out.print(arr[j] + " ");
               break;
            }
         }
     }
   }
}