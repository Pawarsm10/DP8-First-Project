package com.inheritance.assignment;

public class Laptop {
	
	int noOfUSBPorts;
	int processorSpeed;
	public void setNoOfUBSPorts(int noOfUSBPorts) {
		this.noOfUSBPorts=noOfUSBPorts;
		
	}
	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed=processorSpeed;
	}
	
	public int getNoOfUSBPorts() {
		return noOfUSBPorts;
	}
	public int getProcessorSpeed() {
		return processorSpeed;
	}
	public static void main(String[] args) {

       Laptop lp=new Laptop();
       lp.setNoOfUBSPorts(4);
       lp.setProcessorSpeed(100);
       System.out.println(lp.getNoOfUSBPorts());
	   System.out.println(lp.getProcessorSpeed());
	}

}
