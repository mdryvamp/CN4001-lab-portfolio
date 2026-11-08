public class Week2Lab1_3 {
    public static void main(String[] args) {
        double fileSizeMB = 45000;
        double speedMBps = 10;
        double seconds = fileSizeMB / speedMBps;
        System.out.println("download time: " + seconds + " seconds");
    }
}