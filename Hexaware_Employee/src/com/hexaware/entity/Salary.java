package com.hexaware.entity;

public class Salary {
	private int basic;
	private double hra;
	private double net;
	private double gross;
	private double pf;
	
	public Salary(int basic, int hra, int net, int gross, int pf) {
		super();
		this.basic = basic;
		this.hra = hra;
		this.net = net;
		this.gross = gross;
		this.pf = pf;
	}
	
	public Salary() {
		super();
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}
	public int getBasic() {
		return basic;
	}
	public void setHra() {
		this.hra = this.basic*0.1;
	}
	public double getHra() {
		return hra;
	}
	public void setPf() {
		this.pf = this.basic*0.05;
	}
	public double getPf() {
		return pf;
	}
	public double getGross() {
		return gross;
	}
	public void setGross() {
		this.gross = basic+net+hra;
	}
	public void setNet() {
		this.net = gross-pf;
	}
	public double getNet() {
		return net;
	}
	@Override
	public String toString() {
		return "Salary [basic=" + basic + ", hra=" + hra + ", net=" + net + ", gross=" + gross + ", pf=" + pf + "]";
	}
	
	
	
	
	
}
