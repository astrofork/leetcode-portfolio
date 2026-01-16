// @leet imports start
import java.util.*;
import java.math.*;
// @leet imports end

import java.util.HashMap;

// @leet start
class Solution {
    public int romanToInt(String s) {


    HashMap<Character,Integer> map = new HashMap<>();
    
      map.put('I', 1);
      map.put('V', 5);
      map.put('X',10);
      map.put('L',50);
      map.put('C',100);
      map.put('D',500);
      map.put('M',1000);
      int i = s.length() - 1;
      int sum = 0;
      sum = sum + map.get(s.charAt(i));
      i--;


      while(i >= 0){
        if(s.charAt(i) == 'I' && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')){
          sum = sum -1;
          i--;
          continue;
        }
        if(s.charAt(i) == 'X' && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')){
          sum = sum - 10;
          i--;
          continue;
        }
        if(s.charAt(i) == 'C' && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')){
          sum = sum - 100;
          i--;
          continue;
        }
        sum = sum + map.get(s.charAt(i));
        i--;
      }

      return sum;

    }
}
// @leet end
