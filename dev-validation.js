validation of the user
using javascript
code here...
function validationForm(){
  
          var name=document.getElementById("name").value;
		  var email=document.getElementById("email").value;
		  var Password=document.getElementById("Password").value;
		  var confirmPassword=document.getElementById("confirmPassword").value;
	
	#new modifications @11:30am
	       if(name == ""){
			   alert ("Name field must not be empty, Please enter the value")
			   return false
}
#another modifiction @3pm

if (email == "") {
	alert ("Email filed must not be empty")
	return false
	
}
else
{
	var validemail="\s@"
	if (!validemail.test(email)){
		alert("Email is not in valid format, please check")
		return false
	}
	
}