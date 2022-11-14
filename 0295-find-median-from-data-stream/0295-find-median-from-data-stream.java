class MedianFinder {
    //Optimized Appproached

    // max queue is always larger or equal to min queue
    PriorityQueue<Integer> min = new PriorityQueue();
    PriorityQueue<Integer> max = new PriorityQueue(1000, Collections.reverseOrder());

    // Adds a number into the data structure.
    public void addNum(int num) {
        max.offer(num);
        min.offer(max.poll());
        if (max.size() < min.size()) {
            max.offer(min.poll());
        }
    }

    // Returns the median of current data stream
    public double findMedian() {
        if (max.size() == min.size()) return (max.peek() + min.peek()) / 2.0; else return max.peek();
    }
    
    
    
    //     Brute Force Approach
    //     ArrayList<Integer> list = null;

    //     public MedianFinder() {
    //         this.list = new ArrayList<>();
    //     }

    //     public void addNum(int num) {
    //         int right = list.size() - 1;
    //         if(right == -1) {
    //             this.list.add(num);
    //             return;
    //         }
    //         int left = 0;
    //         int mid = 0;
    //         while (left <= right) {
    //             mid = left + (right - left) / 2;
    //             int val = this.list.get(mid);
    //             if (val == num) break; else if (val > num) right = mid - 1; else left = mid + 1;
    //         }

    //         if (this.list.get(mid) > num) {
    //             this.list.add(mid, num);
    //         } else {
    //             this.list.add(mid + 1, num);
    //         }
    //     }

    //     public double findMedian() {
    //         int N = list.size();
    //         if (N % 2 == 0) {
    //             return (this.list.get(N / 2 - 1) + this.list.get(N / 2)) / 2.0;
    //         } else return this.list.get(N / 2) * 1.0;
    //     }
}
/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
