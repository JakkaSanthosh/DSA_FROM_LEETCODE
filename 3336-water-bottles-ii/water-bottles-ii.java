class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        if (numBottles < numExchange)
            return numBottles;
        int res = numBottles;
        int cnt = 0;
        while (numBottles >= numExchange) {
            cnt++;
            numBottles = numBottles - numExchange + 1;
            numExchange++;
        }
        return res + cnt;
    }
}