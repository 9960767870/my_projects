package com.demo.JavaTutorial.model.PassByValueAndPassByReference;

 //Example Of call By Value using Reference Variable

 class ExampleFour {
	
	public static void main(String[] args) {
		
		Language languageObj=new Language("Hindi");
		
		System.out.println("Before accessing the changelanguage method");
		System.out.println(languageObj.languageName);
		

		ExampleFour E1=new ExampleFour();
		E1.changelanguage(languageObj);
	
		
		System.out.println("After accessing the changelanguage method");
		System.out.println(languageObj.languageName);
		
	}
	
	void changelanguage(Language paraObj) {
		
		paraObj.languageName = "English" ;
	}
	 
}
    class Language {
    	
    	String languageName;
    	Language(String languagepara) {
    		languageName=languagepara;
    	}
    	}
    