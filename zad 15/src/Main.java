 class Benchmark {

    public static void main(String[] args) {
	long startTime = System.currentTimeMillis();
	long endTime =60 + startTime;
	long index = 0;
	while (true) {
        double x = endTime * index;
        long now =System.currentTimeMillis();
        if (now > endTime) {
        break;
    }
    index++;
    }
    System.out.println(index + " pętli w ciagu jednej minuty");
    }
}
