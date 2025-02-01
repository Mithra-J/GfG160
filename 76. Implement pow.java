class Solution {
    double power(double b, int e) {
        if (e == 0) return 1.0; 
        
        boolean isNegativeExponent = e < 0;
        long exp = Math.abs((long) e); 
        double result = 1.0;
        
        while (exp > 0) {
            if ((exp & 1) == 1) { 
                result *= b;
            }
            b *= b; 
            exp >>= 1; 
        }
        
        return isNegativeExponent ? 1.0 / result : result;
    }
}
