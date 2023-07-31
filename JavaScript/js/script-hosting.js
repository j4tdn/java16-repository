// hosting
// - function: gọi nó trước khi khai báo thì sẽ scan code từ trên xuống--> phát hiện các function declaration thì
// nó sẽ tạo 1 biến lưu trữ function này trong variable object của excution context sau đó mình gọi thì nó
// xuống thực thi cho mình
// var calculateAge = function(yearOfBirth);

calculateAge(1999)

function calculateAge(yearOfBirth){
	console.log('Age: ' +(new Date().getFullyear()-yearOfBirth));
}

//function expression

var retierment = function(yearOfBirth){
	console.log('retierment in: '+(35-(new Date().getFullyear()-yearOfBirth)));

}

retierment(1995);

//variable
// var age = undefined
console.log(age);
var age =36;
console.log(age);