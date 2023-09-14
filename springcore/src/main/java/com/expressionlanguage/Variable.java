package com.expressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Variable {
	@Value("45")
	private int A;
	@Value("#{23<12?43:12}")
	private int B;
	@Value("#{T(java.lang.Math).sqrt(16)}")
	private double C;
	@Value("#{T(java.lang.Math).PI}")
	private double D;
	@Value("#{4>3}")
	private boolean E;

	public int getA() {
		return A;
	}

	public void setA(int a) {
		A = a;
	}

	public int getB() {
		return B;
	}

	public void setB(int b) {
		B = b;
	}

	public double getC() {
		return C;
	}

	public void setC(double c) {
		C = c;
	}

	public double getD() {
		return D;
	}

	public void setD(double d) {
		D = d;
	}

	public boolean isE() {
		return E;
	}

	public void setE(boolean e) {
		E = e;
	}

	@Override
	public String toString() {
		return "Variable [A=" + A + ", B=" + B + ", C=" + C + ", D=" + D + ", E=" + E + "]";
	}

	

}
