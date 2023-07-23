
/*
	Function Declaration
		+ hoisting
		  --> loading --> scan declaration function as header
	

	Function Expression
		+ hosting no
		+ arrow function

*/
// function printFoo();


console.log('======= Ex04 - Function =======');

printFoo();

function printFoo() {
	console.log('empty --> print foo');
}

printFoo();


// Everything(variable, function) is object

// printBar(); --> error

let printBar = function() {
	console.log('empty --> print bar');
}

console.log('printBar typeof --> ' + (typeof printBar));

printBar();

// printText(); --> error

let printText = () => {
	console.log('empty --> print text');
}

printText();

// Passing function as a function parameter


let sequences = ['1a', '2b', '1c', '2d', '3e'];

// find elemnet start with ...
// find element end with ...

// input: elements
// test: boolean: strategy(element)
function filter(elements, test) {
	let result = [];
	for (let element of elements) {
		if (test(element)) {
			result.push(element);
		}
	}
	return result;
}

/*
function startWiths1(element) {
	return element.startsWith('1');
}

let r1One = filter(sequences, startWiths1);

let r1One = filter(sequences, function(element) {
	return element.startsWith('2');
});
*/

let r1One = filter(sequences, seq => seq.startsWith('3'));

console.log('r1One --> ' + r1One);
