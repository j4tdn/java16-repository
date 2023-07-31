//alert("My name is Teo")
//alert(text)--> void
// confirm(text)--> boolean
// promt(question/tiêu đề, default_answer)-->String
//"==": convert sang cùng 1 kiểu xong mới so sánh giá trị
//"===": so sánh kiểu trước đúng rồi mới so sánh value

//Converter
// + :convert to number
// !!: convert to boolean

let question ="Are you 18 years old or older";

//boolean: true//false
let isValidAge = confirm(question);

if (isValidAge) {
	let accepted = confirm("Do you want to play game");
	if(accepted){
		let name = prompt("Enter your name account","Your name");
		alert(`Wellcome ${name} Todo game`);

		let a = +prompt("Enter A","0")// + String-->numner
		let b = +prompt("Enter B","0")// + String-->numner

		let result = +prompt("Enter result","0")//
		if(result == (a+b)) {
			alert("Correct");
		}else{
			alert("Wrong");
		}
	}
}else{
	alert("see you around");
}

