class Solution {
    public int romanToDecimal(String s) {
    HashMap<Character,Integer> map = new HashMap<>();
    map.put('I',1);
    map.put('V',5);
    map.put('X',10);
    map.put('L',50);
    map.put('C',100);
    map.put('D',500);
    map.put('M',1000);
    int i=0;
    int num = 0;
    while (i<s.length()){
        if(i < s.length()-1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
            num += map.get(s.charAt(i+1)) - map.get(s.charAt(i));
            i++;
        }
        else{
            num += map.get(s.charAt(i));
        }
        i++;
    }
        return num;
    }
}