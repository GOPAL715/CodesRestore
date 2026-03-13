package com.examples.thread;

class Printer{
	public synchronized void printDocument(String docName) {
		System.out.println("Started printing from: "+ Thread.currentThread().getName());
		for(int i=1;i<=3;i++) {
			System.out.println("Printing times "+i+" of "+ docName+" by "+ Thread.currentThread().getName());
			try {
				Thread.sleep(200);
			}catch(InterruptedException e) {
				System.out.println("Interrupted while printing "+ Thread.currentThread().getName());
			}
		}
		System.out.println(Thread.currentThread().getName());		
	}
}

class PrintJob extends Thread{
	 Printer printer;
	 String docName;
	 
	 public PrintJob(Printer printer, String docName) {
		 this.printer = printer;
		 this.docName= docName;
	 }
	 
	 public void run() {
		 printer.printDocument(docName);
	 }
}


public class PrinterDocuments {
	public static void main(String[] args) {
		Printer sharedPrinter = new Printer();
		
		PrintJob j = new PrintJob(sharedPrinter,"Resume.pdf");
		PrintJob j1 = new PrintJob(sharedPrinter,"Resume.docx");
		j.start();
		j1.start();
		
	}

}
