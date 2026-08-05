

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if (n == 0) return 0;
        
        // Combine position and the TIME it takes to reach the target into one array
        double[][] cars = new double[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            // Time = (target - position) / speed
            cars[i][1] = (double)(target - position[i]) / speed[i]; 
        }
        
        // Sort cars by their starting position (ascending)
        Arrays.sort(cars, (a, b) -> Double.compare(a[0], b[0]));
        
        int fleets = 0;
        double maxTime = 0; 
        
        // Loop backwards (from the car closest to the target down to the furthest)
        for (int i = n - 1; i >= 0; i--) {
            // If this car takes STRICTLY MORE time than the fleet ahead of it,
            // it can't catch up. It forms a brand new fleet.
            if (cars[i][1] > maxTime) {
                maxTime = cars[i][1];
                fleets++;
            }
        }
        
        return fleets;
    }
}