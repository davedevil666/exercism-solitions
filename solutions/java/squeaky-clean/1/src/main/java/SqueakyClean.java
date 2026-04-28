class SqueakyClean {
    static String clean(String identifier) {
        String thisidentifier = identifier
            .replace('1', 'l').replace('3', 'e').replace('7', 't')
            .replace('0', 'o').replace("4", "a");
        String resultStr = "";
        boolean flag = false;
        char [] chs = thisidentifier.toCharArray();
        for (char c : chs){
            if (c == '-'){
                flag = true;
                continue;
            }
            if (flag){
                c = Character.toUpperCase(c);
                flag = false;
            }
            if (Character.isWhitespace(c)){
                c = '_';
            }
            
            if (!Character.isLetter(c) && c != '_'){
                continue;
            }
            resultStr += c;
        }
        
        return resultStr;
        
        //throw new UnsupportedOperationException("Please implement the (static) SqueakyClean.clean() method");
    }
}
