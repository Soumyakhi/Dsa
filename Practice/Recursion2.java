import java.util.HashSet;

public class Recursion2 {
    static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer from " + src + " to destination " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("transfer from " + src + " to destination " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
    }

    static void revString(int index, String string) {
        if (index == 0) {
            System.out.println(string.charAt(index));
            return;
        }
        System.out.println(string.charAt(index));
        revString(--index, string);
    }

    static void occurence(int index, String str, int firstO, int lastO, char element) {
        if (index == (str.length())) {
            if (firstO != -1) {
                System.out.println("first occurence : " + firstO);
                System.out.println("last occurence : " + lastO);
            } else {
                System.out.println("no occurence ");
            }
            return;
        }
        if (str.charAt(index) == element) {
            if (firstO == -1 || lastO == -1) {
                firstO = index;
                lastO = index;
            } else {
                lastO = index;
            }
        }
        occurence(++index, str, firstO, lastO, element);
    }

    static boolean isSorted(int index, int[] arr) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] < arr[index + 1]) {
            return isSorted(++index, arr);
        } else {
            return false;
        }
    }

    static void countAllX(String str, int index, int count, String newString) {
        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        if (str.charAt(index) == 'x') {
            count++;
            countAllX(str, ++index, count, newString);
        } else {
            newString += str.charAt(index);
            countAllX(str, ++index, count, newString);
        }

    }

    static void removeDuplicates(String str, int index, boolean[] map, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        if (map[str.charAt(index) - 'a']) {
            removeDuplicates(str, ++index, map, newString);
        } else {
            newString += str.charAt(index);
            map[str.charAt(index) - 'a'] = true;
            removeDuplicates(str, ++index, map, newString);
        }

    }

    static void subSequences(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currencChar = str.charAt(index);
        subSequences(str, index + 1, newString + currencChar);
        subSequences(str, index + 1, newString);
    }

    static void uniqueSubSequences(String str, int index, String newString, HashSet<String> set) {
        if (index == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currencChar = str.charAt(index);
        uniqueSubSequences(str, index + 1, newString + currencChar, set);
        uniqueSubSequences(str, index + 1, newString, set);
    }

    static void printCombinations(String str, int index, String combination, String[] keypad) {
        if (index == str.length()) {
            System.out.println(combination);
            return;
        }
        int currentChar = Character.getNumericValue(str.charAt(index));
        for (int i = 0; i < keypad[currentChar].length(); i++) {
            printCombinations(str, index + 1, combination + keypad[currentChar].charAt(i), keypad);
        }
    }

    public static void main(String[] args) {
        System.out.println("Tower of Hanoi");
        towerOfHanoi(3, "S", "H", "D");
        System.out.println("Reverse A String");
        String str = "abcd";
        revString(str.length() - 1, str);
        System.out.println("Occurence");
        occurence(0, "zbaabbabccdaabdad", -1, -1, 'd');
        System.out.println("check if sorted : ");
        int arr[] = new int[] { 1, 77, 2, 3, 4, 5 };
        System.out.println(isSorted(0, arr));
        System.out.println("move all x : ");
        countAllX("xxamarzxsexx", 0, 0, "");
        System.out.println("Remove duplicates");
        boolean map[] = new boolean[26];
        removeDuplicates("adsdstrrraccxa", 0, map, "");
        System.out.println("Subsequences");
        subSequences("abc", 0, "");
        System.out.println("Unique Subsequences");
        uniqueSubSequences("aaa", 0, "", new HashSet<String>());
        System.out.println("Keypad Subsequences");
        String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
        printCombinations("23", 0, "", keypad);
    }
}
