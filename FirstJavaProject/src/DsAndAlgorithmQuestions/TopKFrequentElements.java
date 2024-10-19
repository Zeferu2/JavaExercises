package DsAndAlgorithmQuestions;

import java.util.*;
public class TopKFrequentElements {

	 public int[] topKFrequent(int[] nums, int k) {
	        // Step 1: Count the frequency of each element using a HashMap
	        Map<Integer, Integer> frequencyMap = new HashMap<>();
	        for (int num : nums) {
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	        }

	        // Step 2: Use a PriorityQueue (Min-Heap) to keep the top k elements
	        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> frequencyMap.get(a) - frequencyMap.get(b));

	        for (int num : frequencyMap.keySet()) {
	            minHeap.offer(num);
	            if (minHeap.size() > k) {
	                minHeap.poll();  // Remove the least frequent element when the size exceeds k
	            }
	        }

	        // Step 3: Extract the elements from the heap
	        int[] result = new int[k];
	        for (int i = k - 1; i >= 0; i--) {
	            result[i] = minHeap.poll();
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        TopKFrequentElements solution = new TopKFrequentElements();
	        
	        // Test Case 1
	        int[] nums1 = {1,1,1,2,2,3};
	        int k1 = 2;
	        System.out.println(Arrays.toString(solution.topKFrequent(nums1, k1))); // Output: [1, 2]

	        // Test Case 2
	        int[] nums2 = {1};
	        int k2 = 1;
	        System.out.println(Arrays.toString(solution.topKFrequent(nums2, k2))); // Output: [1]
	    }	
	
}
