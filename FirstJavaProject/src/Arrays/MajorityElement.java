package Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Example array
        int[] array = {3, 3, 4, 2, 4, 4, 2, 4, 4};

        // Find the majority element
        Integer majority = findMajorityElement(array);

        if (majority != null) {
            System.out.println("The majority element is: " + majority);
        } else {
            System.out.println("No majority element exists.");
        }
    }

    // Method to find the majority element using Boyer-Moore Voting Algorithm
    public static Integer findMajorityElement(int[] array) {
        Integer candidate = null;
        int count = 0;

        // Phase 1: Find the candidate
        for (int num : array) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2: Verify the candidate
        count = 0;
        for (int num : array) {
            if (num == candidate) {
                count++;
            }
        }

        // Check if the candidate is indeed the majority element
        if (count > array.length / 2) {
            return candidate;
        } else {
            return null;
        }
	}

}
