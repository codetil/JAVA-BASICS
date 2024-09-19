public class String_Compression {
        public static String compress(String str) {
            if (str == null || str.length() <= 1) {
                return str;
            }
    
            StringBuilder compressed = new StringBuilder();
            int count = 1;
            char current = str.charAt(0);
    
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == current) {
                    count++;
                } else {
                    compressed.append(current);
                    if (count > 1) {
                        compressed.append(count);
                    }
                    current = str.charAt(i);
                    count = 1;
                }
            }
    
            // Append the last character and its count
            compressed.append(current);
            if (count > 1) {
                compressed.append(count);
            }
    
            return compressed.length() < str.length() ? compressed.toString() : str;
        }
    
        public static void main(String args[]) {
            String str = "aabcccccaaa";
            System.out.println("Original string: " + str);
            System.out.println("Compressed string: " + compress(str));
        }
    }

