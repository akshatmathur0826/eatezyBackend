package com.example.foodorderingapp.malldetails;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Malldetails {

	  @Id
	    private String mallid;
	    private String mallname;
	    
	    public Malldetails() {}
	    
		public Malldetails(String mallid, String mallname) {
			super();
			this.mallid = mallid;
			this.mallname = mallname;
		}

		public String getMallid() {
			return mallid;
		}
		public void setMallid(String mallid) {
			this.mallid = mallid;
		}
		

		public String getMallname() {
			return mallname;
		}

		public void setMallname(String mallname) {
			this.mallname = mallname;
		}
	    
}
