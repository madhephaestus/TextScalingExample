// code here

CSG textToSize(String text, double x, double y, double z) {
		CSG startText = CSG.text( text, z) ;
		double scalex = x/startText.getTotalX();
		double scaley = y/startText.getTotalY();
		return startText
				.scalex(xscale)
				.scaley(yScale)
				.toXMin()
				.toYMin();
	}

return textToSize("Testing", 30,20,10)