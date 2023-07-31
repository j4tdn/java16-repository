//global object - execution context
//scope chain: var, let, const

//ES5: var = global variable --> nó được lưu trữ ở global executive context(nơi lưu trữ các biến global)
// web brower: var lưu trong window

// var name5 ='Ta';
// var age5 = 36//==> age = window.age
// name5 = 'Yaya';
// console.log(`${name5} - ${age5}`);


// //ES6 - ES2015 --> let, const(hằng số) == final
// const name6 ='Ta';
// var age6 = 36//==> age = window.age
// name6 = 'Yaya';
// console.log(`${name6} - ${age6}`);

//let, const: block scope
//var: function scope
function driversLincence5(passedTest){
	if (passedTest) {
		var firstName = 'John';
		var yearOfBirth = 1998;

		console.log(`${firstName} born in${yearOfBirth}, now is allowed to drive a car`);
	}
}
driversLincence5(true);

function driversLincence6(passedTest){
	if (passedTest) {
		let firstName = 'John';
		const yearOfBirth = 1998;

		console.log(`${firstName} born in${yearOfBirth}, now is allowed to drive a car`);
	}
}
driversLincence6(true);