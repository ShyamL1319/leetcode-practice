class MedianFinder {
    ArrayList<Integer> list = null;

    public MedianFinder() {
        this.list = new ArrayList<>();
    }

    public void addNum(int num) {
        int right = list.size() - 1;
        if(right == -1) {
            this.list.add(num); 
            return;
        }
        int left = 0;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            int val = this.list.get(mid);
            if (val == num) break; else if (val > num) right = mid - 1; else left = mid + 1;
        }

        if (this.list.get(mid) > num) {
            this.list.add(mid, num);
        } else {
            this.list.add(mid + 1, num);
        }
    }

    public double findMedian() {
        int N = list.size();
        if (N % 2 == 0) {
            return ((double) this.list.get(N / 2 - 1) + (double) this.list.get(N / 2)) / 2.0;
        } else return (double) this.list.get(N / 2);
    }
}
/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
