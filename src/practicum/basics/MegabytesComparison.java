package practicum.basics;

public class MegabytesComparison {
    public static void main(String[] args) {
        int megabytes = 64000;
        int gigabytes = 64;
        int megabytesPerGigabyte = 1024;
        int gigabytesToMegabytes = gigabytes * megabytesPerGigabyte;

        boolean isMbMore = megabytes > gigabytesToMegabytes;

        System.out.println(isMbMore);
    }
}
