package hrms.TestScript;

import com.hrms.LIB.General;

public class TC_HRMS_001  {

	public static void main(String[] args) throws InterruptedException { 
		 General gl=new General ( ) ;
		 gl.setUp() ;
		 gl.adminLogin ( ) ;
		 gl.addEmp ( ) ; 
		 gl.delEmp ( ) ; 
		 gl.adminLogout ( ) ;
		 gl.tearDown ( ) ;
	
		 
	}

}
