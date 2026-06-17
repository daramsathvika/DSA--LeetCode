class Solution {
    public List<String> letterCombinations(String digits) {
        int i=0,n=digits.length();
        StringBuilder string = new StringBuilder("");
        List<String> set = new ArrayList<>();
        combis(string,0,digits,set);
        return set;
    }
    public void combis(StringBuilder string,int i, String digits,List<String> set){
        StringBuilder strings = new StringBuilder(string);
        if(i==digits.length()){set.add(strings.toString());return;}
        char c=digits.charAt(i);
        char[] list = numberset(c);
        for(char k:list){
            strings.append(k);
            combis(strings,i+1,digits,set);
            strings.deleteCharAt(strings.length()-1);
        }
    }
    public char[] numberset(char c){
        char[] list;
        switch(c){
            case '2':
                list = new char[3];
                list[0]='a';list[1]='b';list[2]='c';
                return list;
            case '3':
                list = new char[3];
                list[0]='d';list[1]='e';list[2]='f';
                return list;
            case '4':
                list = new char[3];
                list[0]='g';list[1]='h';list[2]='i';
                return list;
            case '5':
                list = new char[3];
                list[0]='j';list[1]='k';list[2]='l';
                return list;
            case '6':
                list = new char[3];
                list[0]='m';list[1]='n';list[2]='o';
                return list;
            case '7':
                list = new char[4];
                list[0]='p';list[1]='q';list[2]='r';list[3]='s';
                return list;
            case '8':
                list = new char[3];
                list[0]='t';list[1]='u';list[2]='v';
                return list;
            case '9':
                list = new char[4];
                list[0]='w';list[1]='x';list[2]='y';list[3]='z';
                return list;
        }
        return new char[1];
    }
}