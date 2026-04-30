class Solution {

    public String encode(List<String> strs) {
        String encodedstr="";
        for(String str:strs)
        {
            for(int i=0;i<str.length();i++)
            {
            encodedstr+=(int)(str.charAt(i));
            encodedstr+='#';

            }
            encodedstr+='@';
        }
        return encodedstr;
    }

    public List<String> decode(String str) {
        List<String> strs=new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
        String s="";
            while(str.charAt(i)!='@')
            {
                String ascii="";
                while(str.charAt(i)!='#')
                {
                    ascii+=str.charAt(i);
                    i++;
                }
                s+=(char)((int)(Integer.valueOf(ascii)));
                i++;
            }
            strs.add(s);
        }
        return strs;
    }
}
