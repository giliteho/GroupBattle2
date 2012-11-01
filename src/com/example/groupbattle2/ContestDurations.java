package com.example.groupbattle2;

public enum ContestDurations {

	ONE_HOUR ("One Hour"),
	ONE_DAY ("One Day"),
	TWO_DAYS("Two Days"),
	ONE_WEEK("One Week"),
	TWO_WEEKS("Two Weeks"),
	ONE_MONTH("One Month");
	
	private String rep;
    private ContestDurations(String s) {
        this.rep = s;
    }

    public static ContestDurations fromString(String s) {
        for (ContestDurations c : values() ){
            if (c.rep.equals(s)) return c;
        }
        return null;
    }
    
    @Override
    public String toString()
    {
    	return rep;
    }
}
