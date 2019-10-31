package com.ctgu;


public class wf {
	public static void main(String[] args) throws Exception {
		char parameter;
		int i=0;
		String filename = args[args.length-1];
		parameter = args[i].charAt(1);
		
		if(args[0].charAt(0)=='-') {
			switch(parameter) {
			case 'c': MyUtils.showletterf(filename);
				break;
				
			case 'd': 
				int num = MyUtils.isNumber(args[args.length-1]);
				if(args[i+1].equals("-s"))
					MyUtils.showlists(args[i+2],num);
				else 
					MyUtils.showfileword(args[i+1],num);
				break;
				
			case 'f': MyUtils.showwordc(filename,-1);
				break;
				
			case 'p':
				break;
				
			case 'x': MyUtils.stopwords(filename,args[i+1]);
				break;
			
			}
		}
		else {System.out.println("参数异常");}
	}

}
