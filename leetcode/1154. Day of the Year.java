class Solution {
    public int dayOfYear(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        int ordinaryYear[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int no_of_days = day;
        
        for (int i = 1; i < month; i++) {
            no_of_days += ordinaryYear[i];
        }
        
        if (isLeapYear(year) && month > 2) {
            no_of_days += 1;
        }
        
        return no_of_days;
    }
    
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
