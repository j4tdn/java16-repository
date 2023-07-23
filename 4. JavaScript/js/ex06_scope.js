/*
	
	let    : block scope
	var    : function scope
	const  : block scope + unmodifiable

*/

console.log('======= Ex06 - Scope =======');

function test(age) {
	if (age > 10) {
		var ticket = 'TCX-280';
		var budget = 20;
	}
	console.log(`ticket --> ${ticket}`);
	console.log(`budget --> ${budget}`);

	const amountOfDevs = 50;
	console.log(`amountOfDevs --> ${amountOfDevs}`);
}

test(20);