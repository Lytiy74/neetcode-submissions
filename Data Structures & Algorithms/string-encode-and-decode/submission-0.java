class Solution {
    public String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String stringToEncode : strs) {
            stringBuilder
                    .append(stringToEncode.length())
                    .append("#")
                    .append(stringToEncode);
        }


        return stringBuilder.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();

        char[] charArray = str.toCharArray();
        StringBuilder codedStringLength;
        StringBuilder decodedString;
        for (int i = 0; i < charArray.length;) {
            codedStringLength = new StringBuilder();
            decodedString = new StringBuilder();

            if (Character.isDigit(charArray[i])) {

                while (charArray[i] != '#') {
                    codedStringLength.append(charArray[i]);
                    i++;
                }

                i++;

            }

            int lengthOfEncodedString = Integer.parseInt(codedStringLength.toString());
            for (int i1 = 0; i1 < lengthOfEncodedString; i1++) {
                decodedString.append(charArray[i++]);
            }
            decoded.add(decodedString.toString());
        }


        return decoded;
    }
}
