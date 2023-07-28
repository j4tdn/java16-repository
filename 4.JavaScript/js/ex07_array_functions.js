console.log('======= Ex07 - Array Functions =======');

Array.prototype.add = function(index, newValue) {
	this.splice(index, 0, newValue);
}

let sequences = ['a', 'c', 'z', 'x', 'k'];

// add at index i
// js prototype(available methods)

// sequences.splice(2, 0, 'w3c');
sequences.add(2, 'www');

console.log('sequences --> ' + sequences);

let filtered = sequences.filter(seq => {
	return seq > 'c';
})

console.log('filtered --> ' + filtered);