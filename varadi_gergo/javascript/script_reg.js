//Registration submit
function sendToServer(){

	//User object
	var user = {
		"firstName" : document.querySelector(".firstName").value,
		"lastName" : document.querySelector(".lastName").value,
		"email" : document.querySelector(".emailAddress").value + "@" + document.querySelector(".emailDomain").value,
		"phone" : document.querySelector(".phone").value,
		"education" : document.querySelector(".education").value,
		"englishLevel" : document.querySelector(".englishLevel").value,
		"age" : document.querySelector(".age").value,
		"newsLetter" : document.querySelector(".newsLetter").value
	};
	
	//Validate without submit
	jQuery("form").on('submit', function(e){
		e.preventDefault();
	});

	//Send to server
	$.post("https://yellowroad.training360.com/registration", user, function(res){
		console.log(res);
		if(res.success == true){
			document.querySelector("#submitBtn").value = "Sikeres Regisztráció";
		}
	});
}

//Clear all input fields with trash icon
function clearInput(){
	var inputFields = document.querySelectorAll("[type=text]");
	var selectFields = document.querySelectorAll("select");
	for(var k in inputFields){
		inputFields[k].value = "";
	}
	for(var k in selectFields){
		selectFields[k].value = "";
	}
}