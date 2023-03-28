public class StringOperations {
    public static void main (String [] args) {
        String myName = "Jeremy Penaredondo";
        myName = myName.substring(1, 17);
        myName = "A" + myName;
        myName = myName + "z";
        System.out.println(myName);
        String url = "www.amiami.com";
        String urlName = url.substring(4, (url.length() - 4)) + "1331";
        System.out.println(urlName);
    }
}
