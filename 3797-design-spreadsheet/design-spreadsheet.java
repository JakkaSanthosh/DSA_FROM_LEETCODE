class Spreadsheet {
    Map<String,Integer> mp;
    int rows;
    public Spreadsheet(int rows) {
        this.rows=rows;
        mp=new HashMap<>();
    }
    
    public void setCell(String cell, int value) {
        mp.put(cell,value);
    }
    
    public void resetCell(String cell) {
       mp.remove(cell);
    }
    
    public int getValue(String formula) {
        int idx = formula.indexOf('+');
        int val1 = 0, val2 = 0;
        String a=formula.substring(1,idx);
        String b=formula.substring(idx+1);
        if(mp.containsKey(a)) val1=mp.get(a);
        else if(!Character.isLetter(a.charAt(0)))
            val1 = Integer.parseInt(a);
        if(mp.containsKey(b)) val2=mp.get(b);
        else if(!Character.isLetter(b.charAt(0)))
            val2 = Integer.parseInt(b);
        return val1 + val2;

    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */