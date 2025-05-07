package RecursionBasicsPart2;


public class RemoveDuplicates {
    public static void RemoveDuplicate(String str, int idx, StringBuilder newStr, boolean map []) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        //Work
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true) {
            //Duplicate
            RemoveDuplicate(str, idx+1, newStr, map);
        } else {
            map[currChar-'a'] = true;
            RemoveDuplicate(str, idx+1, newStr.append(currChar), map);
        }
        }

        public static void main(String args[]) {
            String str = "appnacollege";
            RemoveDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
        }
    }

