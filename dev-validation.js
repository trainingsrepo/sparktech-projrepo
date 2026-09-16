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
#Akshat Developer UI/UX Developer changes the code on 16-sep-2026
cons num1=10;
cons num2=20;
	cons sum=num1+num2;
	console.log('The Sum of the numbers are '+ num1+' 'and + num2 +' +sum);
#new added code
	if(num == random) {
	console.log("You guessed the right result");
	}
	
	
}
