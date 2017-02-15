//Contains the users in a global variable
var usersContainer;

//Data request
$.getJSON("https://yellowroad.training360.com/registration/users", function(users) {
	niceDatas(users);
	generateTable(users);
	usersContainer = users;
});

//Users editing
function niceDatas(users){
	for(var k in users){
		//Phone
		if(users[k].phone == undefined){
			users[k].phone = "";
		}
		//Education
		if(users[k].education == "a"){
			users[k].education = "Főiskola/Egyetem";
		}else if(users[k].education == "b"){
			users[k].education = "Érettségi";
		}else{
			users[k].education = "Egyéb";
		}
		//English level
		if(users[k].englishLevel == "a"){
			users[k].englishLevel = "Alapfok";
		}else if(users[k].englishLevel == "b"){
			users[k].englishLevel = "Középfok";
		}else{
			users[k].englishLevel = "Felsőfok";
		}
		//Age
		if(users[k].age == "a"){
			users[k].age = "18-25 év";
		}else if(users[k].age == "b"){
			users[k].age = "26-35 év";
		}else{
			users[k].age = "35 év felett";
		}
		//Newsletter
		if(users[k].newsLetter == undefined){
			users[k].newsLetter = "<span class='glyphicon glyphicon-remove'></span>";
		}else{
			users[k].newsLetter = "<span class='glyphicon glyphicon-ok'></span>";
		}
	}
}

//Table fill with users
function generateTable(users){
	var tableRows = "";
	for(var k in users){
		tableRows += "<tr class='tableRows'><td>" +
			users[k].lastName + "</td><td>" +
			users[k].firstName + "</td><td>" +
			users[k].email + "</td><td>" +
			users[k].phone + "</td><td>" +
			users[k].englishLevel + "</td><td>" +
			users[k].education + "</td><td>" +
			users[k].age + "</td><td style='text-align:center'>" +
			users[k].newsLetter + "</td></tr>";
	}
	document.querySelector(".resultTableRows").innerHTML = tableRows;
};

//Reload page with icon
function resultRandom(){
	location.reload();
}