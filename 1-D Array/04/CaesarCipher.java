public class CaesarCipher {
    public static void main(String[] args) {
        // key is positive
        String s = "abc";
        int key =26;
        String s2 ="";
        int multiple = key/26;

        // approach 1:-
        // for(int i=0; i<s.length(); i++){
        //     int ch_ascii = (int)s.charAt(i);
        //     int ch_asciiPlusKey = ch_ascii+key;
        //     int ch_asciiMinusKey = ch_ascii+key;
        //     int newCh_ascii=0;
        //     if(key>0){
        //         if(ch_asciiPlusKey>122){
        //             newCh_ascii= (ch_asciiPlusKey-122)+96;
        //         } else{
        //             newCh_ascii = ch_asciiPlusKey;
        //         }
        //     } else{
        //         if(ch_asciiMinusKey<97){
        //             newCh_ascii = -(97-ch_asciiMinusKey)+123;
        //         } else{
        //             newCh_ascii = ch_asciiMinusKey;
        //         }
        //     }
            
        //     char neww = (char)newCh_ascii;
        //     s2+= neww;
        // }





        // approach 2:-

        for(int i=0; i<s.length(); i++){
            int ascii_value = (int)s.charAt(i);
            int chPlusKey = ascii_value+key;

            int new_ascii = -1;
            if(chPlusKey>122){
                new_ascii = chPlusKey-multiple*26;
            }
            if(chPlusKey<97){
                new_ascii = chPlusKey+multiple*26;
            }

            s2+= (char)new_ascii;

        }


        System.out.println(s2);
    }
}
