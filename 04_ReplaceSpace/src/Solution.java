public class Solution {
    public String replaceSpace(StringBuffer str) {
        String strs = str.toString();
        char[] chs = strs.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i < chs.length;i++){
            if(chs[i] == ' '){
                sb.append("%20");
            }else{
                sb.append(chs[i]);
            }
        }
        return sb.toString();
    }
}