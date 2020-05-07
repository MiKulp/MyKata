package exercises.SevenKyu.ConvertListToString;

public class ConvertKata {
    public static void main(String[] args) {
        String s = stringifyRec(new Node(0, new Node(1, new Node(4, new Node(9, new Node(16))))), "");
        System.out.println(s);
    }

    public static String stringify(Node list) {
        return stringifyRec(list, "");
    }

    public static  String stringifyRec (Node list, String s) {
        if (list == null) return s.concat("null");
        s = s.concat(list.getData() + " -> ");
        return stringifyRec(list.getNext(), s);
    }
}
