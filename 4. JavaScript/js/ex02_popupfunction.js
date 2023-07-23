

// == --> stack
// equals --> heap


// ==  --> '15' == 15 --> true(auto convert to same data type) 
// === --> '15' === 15 --> false(same type, same value)

console.log('======= Ex02 - Popup Function =======');

let popButton = document.querySelector('.btn-popup');
popButton.onclick = function() {
	let ok = confirm('Hello there, do You want to play JS popup game ?');

	if (ok) {

		let fname = prompt('Please fill Your Name: ');
		// let age = +prompt('Please fill You Age: '); // +string --> number

		// random a number from 1 to 10
		let a = 1 + Math.round(Math.random() * 10);
		let b = 1 + Math.round(Math.random() * 10);

		let actual = (a + b) % 2 !== 0 ? 'OOD' : 'EVEN';
		let expected = prompt('GUESS result of A + B is "ODD" || "EVEN" ?');
		

		if (expected === actual) {
			alert(`You are very lucky today --> Congratulations ${fname} for the gift`);
		} else {
			alert('Sadly wrong --> Hope to see You next time');
		}
	}
}
